<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="demo.css" media="screen">
        <link rel="stylesheet" href="style.css" media="screen">
        <link rel="stylesheet" href="//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dijit/themes/claro/claro.css" media="screen">
        <style type="text/css">
            html, body {
                width: 100%;
                height: 100%;
                margin: 0;
            }
        </style>
        <!-- configure Dojo -->
        <script>
            var dojoConfig = {
                has: {
                    'dojo-firebug': false,
                    'dojo-debug-messages': true
                },
                parseOnLoad: true,
                async: true,
                baseUrl: '.',
                waitSeconds: 5,
                packages: [
                    {name: 'dojo'}, {name: 'dijit'},
                    {name: 'dojox'},
                    {name: 'demo', location: '/Dojo01App/demo'}],
                map: {
                    // Instead of having to type "dojo/domReady!", we just want "ready!" instead
                    "*": {
                        ready: "dojo/domReady"
                    }
                }};
        </script>
    <h1>Hello World!</h1>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body class="claro">
    <div id="appLayout" class="demoLayout" 
         data-dojo-type="dijit/layout/BorderContainer" 
         data-dojo-props="design: 'headline'">
        <div class="centerPanel" 
             data-dojo-type="dijit/layout/ContentPane" 
             data-dojo-props="region: 'center'">
            <div>
                <h4>Group 1 Content</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
            </div>
            <div>
                <h4>Group 2 Content</h4>
            </div>
            <div>
                <h4>Group 3 Content</h4>
            </div>
        </div>
        <div class="edgePanel" 
             data-dojo-type="dijit/layout/ContentPane" 
             data-dojo-props="region: 'top'">Header content (top)</div>
        <div id="leftCol" class="edgePanel" 
             data-dojo-type="dijit/layout/ContentPane" 
             data-dojo-props="region: 'left', splitter: true">Sidebar content (left)</div>
    </div>

    <!-- load Dojo -->
    <script src="//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dojo/dojo.js"></script>
    <script>
            require(["dojo/parser", "dijit/layout/BorderContainer", "dijit/layout/TabContainer", "dijit/layout/ContentPane", "dojo/domReady!"], function (parser) {
                parser.parse();
            });
    </script>
</body>
</html>
