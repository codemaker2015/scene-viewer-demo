package com.example.sceneviewerdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.HashMap;

public class SceneViewerDemoActivity extends AppCompatActivity {

    RadioButton modelDuckRbt, arOnlyRbt, arPreferred;
    SwitchMaterial titleSwitch, linkSwitch, resizableSwitch;
    Button simpleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_viewer_demo);

        modelDuckRbt = findViewById(R.id.model_duck_rbt);
        arOnlyRbt = findViewById(R.id.ar_only_rbt);
        arPreferred = findViewById(R.id.ar_preferred);
        titleSwitch = findViewById(R.id.title_switch);
        linkSwitch = findViewById(R.id.link_switch);
        resizableSwitch = findViewById(R.id.resizable_switch);
        simpleBtn = findViewById(R.id.simple_btn);

        simpleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
                Uri intentUri = createIntentUri();

                /* Alternative version */
//                Uri intentUri = Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon()
//                    .appendQueryParameter("file", "https://raw.githubusercontent.com/codemaker2015/glTF-Sample-Models/master/2.0/Duck/glTF/Duck.gltf")
//                    .appendQueryParameter("mode", "ar_only")
//                    .appendQueryParameter("title", "Duck")
//                    .appendQueryParameter("resizable", "false")
//                    .build();

                sceneViewerIntent.setData(intentUri);
                sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox");
                startActivity(sceneViewerIntent);
            }
        });
    }

    private Uri createIntentUri() {
        Uri.Builder intentUri = Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon();
        HashMap<String, String> params = getIntentParams();
        params.forEach((String key, String value) -> intentUri.appendQueryParameter(key, value));
        return intentUri.build();
    }

    private HashMap<String, String> getIntentParams() {
        HashMap params = new HashMap<String, String>();
        if(modelDuckRbt.isChecked())
            params.put("file", "https://raw.githubusercontent.com/codemaker2015/glTF-Sample-Models/master/2.0/Duck/glTF/Duck.gltf");
        else
            params.put("file", "https://raw.githubusercontent.com/codemaker2015/glTF-Sample-Models/master/2.0/BrainStem/glTF/BrainStem.gltf");

        if (titleSwitch.isChecked())
            params.put("title", "SceneViewer Demo");

        if (linkSwitch.isChecked())
            params.put("link", "https://github.com/codemaker2015/scene-viewer-demo");

        if(arOnlyRbt.isChecked())
            params.put("mode","ar_only");

        if(arPreferred.isChecked())
            params.put("mode","ar_preferred");

        if (resizableSwitch.isChecked())
            params.put("resizable", "true");
        else
            params.put("resizable", "false");

        return params;
    }
}