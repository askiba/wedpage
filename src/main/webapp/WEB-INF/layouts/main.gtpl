<!doctype html>
<html>
<head>
    <title><sitemesh:write property='title'/> | Ania i Julek</title>
    <link rel="shortcut icon" href="/images/favicon.ico" type="image/png">
    <link rel="icon" href="/images/favicon.ico" type="image/png">
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="/css/bootstrap-theme.min.css" />
    <script type="text/javascript" src="/js/jquery-1.11.0.js">
    </script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <style type="text/css">
    .center {
        text-align: center;
    }
    </style>
    <sitemesh:write property='head'/>
</head>
<body>
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/">Strona g��wna</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
        <sitemesh:write property='body'/>
    </div>
</body>
</html>

