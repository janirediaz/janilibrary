package janilibrary

import com.janilibrary.Role
import com.janilibrary.User
import com.janilibrary.UserRole


class UserController {

    def mailService

    def index() {

    }

    def saveUser() {
        def user = new User();
        user.username = params.username;
        user.password = params.password;
        user.email = params.email;
        user.confirmationDate = new Date();
        user.registrationDate = new Date(System.currentTimeMillis());
        user.tokenConfirmation = UUID.randomUUID().toString();
        if (!user.save()) {
            println user.errors.allErrors.join('\n');
        }

        def role = Role.get(2);
        println role.authority;
        UserRole.create(user, role, true);

        mailService.sendMail {
            to "janire.diaz@gmail.com"
            subject "Confirmation"
            text ""
        }

    }


    def confirmToken(){
        def user = User.findBytokenConfirmation(params.tokenConfirmation);
        if(User != null){
            user.enabled = true;
            if(!user.save()){
                println user.errors.allErrors.join('\n');
            }

        }else{
            flash.error = "token invalido"
            redirect(controller: 'user', action:'saveUser');
        }

    }



}
