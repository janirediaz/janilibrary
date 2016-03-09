import com.janilibrary.Role
import com.janilibrary.User
import com.janilibrary.UserRole

class BootStrap {

    def init = { servletContext ->
        if (Role.count() < 1){
            def adminRole = new Role('ROLE_ADMIN').save();
            def normalRole = new Role('ROLE_NORMAL').save();

        }

    }
    def destroy = {
    }
}
