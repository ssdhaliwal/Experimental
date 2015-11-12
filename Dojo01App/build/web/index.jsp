<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="js/dojo-release-1.10.4-src/dijit/themes/claro/claro.css" media="screen">
    </head>
    <script src="//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dojo/dojo.js" 
    data-dojo-config="async: true"></script>
    <body>
        <h1 id="greeting">Hello</h1>
        <script>
            require([
                'dojo/dom',
                'dojo/fx',
                'dojo/dom-construct',
                'dojo/domReady!'
            ], function (dom, fx, domConstruct) {
                var greetingNode = dom.byId('greeting');
                domConstruct.place('<em> Dojo!</em>', greetingNode);

                // ...but now, with an animation!
                fx.slideTo({
                    node: greeting,
                    top: 100,
                    left: 200
                }).play();
            });
        </script>
    </body>
</html>