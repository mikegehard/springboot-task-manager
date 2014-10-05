//layout 'layouts/main.tpl',
//    mainBody: contents {
//        main {
//            h1(message)
//        }
//    }

    yieldUnescaped '<!DOCTYPE html>'
    html {
        head {
            title('Spring Boot Task Manager')
        }
        body {
            header("Header")
            main {
                h1(message)
            }
            footer {
                yieldUnescaped('&copy; 2014 Footer')
            }
        }
    }