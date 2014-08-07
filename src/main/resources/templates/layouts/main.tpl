yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Spring Boot Task Manager')
    }
    body {
        header("Header")
        mainBody()
        footer {
            yieldUnescaped('&copy; 2014 Footer')
        }
    }
}