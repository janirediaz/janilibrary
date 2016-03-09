

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.janilibrary.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.janilibrary.UserRole'
grails.plugin.springsecurity.authority.className = 'com.janilibrary.Role'
grails.plugin.springsecurity.securityConfigType = "InterceptUrlMap"
grails.plugin.springsecurity.interceptUrlMap = [
        [pattern: '/',               access: ['permitAll']],
        [pattern: '/error',          access: ['permitAll']],
        [pattern: '/index',          access: ['permitAll']],
        [pattern: '/index.gsp',      access: ['permitAll']],
        [pattern: '/shutdown',       access: ['permitAll']],
        [pattern: '/assets/**',      access: ['permitAll']],
        [pattern: '/**/js/**',       access: ['permitAll']],
        [pattern: '/**/css/**',      access: ['permitAll']],
        [pattern: '/**/images/**',   access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']],
        [pattern: '/login',          access: ['permitAll']],
        [pattern: '/login/**',       access: ['permitAll']],
        [pattern: '/logout',         access: ['permitAll']],
        [pattern: '/logout/**',      access: ['permitAll']],
        [pattern: '/user',           access: ['permitAll']],
        [pattern: '/user/**',        access: ['permitAll']]

]


grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/user/**', filters: 'none'],
	[pattern: '/**',filters: 'JOINED_FILTERS']
]


environments {
	development {
		//grails.logging.jul.usebridge = true
		grails.plugin.springsecurity.debug.useFilter = true
		grails {
			mail {
				host = "smtp.live.com"
				port = 587
				username = ""
				password = ""
				props = ["mail.smtp.starttls.enable":"true",
						 "mail.smtp.port":"587"]

			}
		}
	}
		grails.mail.default.from="noreply@mydomain.com"

}
