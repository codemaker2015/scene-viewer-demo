# Scene Viewer Demo

Scene Viewer is an immersive viewer that enables 3D and AR experiences from your website or Android app. Users can easily place, view and interact with web-hosted 3D models in real world environment.

Scene Viewer requires an ARCore supported device and recent version of Google Play Services for AR. 

### Scene viewer integration
You can use an explicit Android intent to launch Scene Viewer. It can be triggered from an HTML page or an Android app.

```
<!DOCTYPE html>
<html>

<head>
  <title>Scene Viewer Demo</title>
  <style>
    body {
      background-color: black;
      text-align: center;
      color: white;
      font-family: Arial, Helvetica, sans-serif;
    }
  </style>
</head>

<body>
  <h1>Scene Viewer Demo</h1>
  <p>See Avacado in your 3D space</p>
  <a href="intent://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Avocado/glTF/Avocado.gltf#Intent;scheme=https;package=com.google.android.googlequicksearchbox;action=android.intent.action.VIEW;S.browser_fallback_url=https://developers.google.com/ar;end;">
    <img src="https://raw.githubusercontent.com/codemaker2015/scene-viewer-demo/master/resources/avocado.webp" />
  </a> <br />
  <a href="intent://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Avocado/glTF/Avocado.gltf#Intent;scheme=https;package=com.google.android.googlequicksearchbox;action=android.intent.action.VIEW;S.browser_fallback_url=https://developers.google.com/ar;end;">
    Click Here
  </a>
</body>

</html>
```

### Screenshots

![Screenshot1](https://github.com/codemaker2015/scene-viewer-demo/blob/master/resources/screenshot1.jpeg)
![Screenshot2](https://github.com/codemaker2015/scene-viewer-demo/blob/master/resources/screenshot2.jpeg)
![Screenshot3](https://github.com/codemaker2015/scene-viewer-demo/blob/master/resources/screenshot3.jpeg)

