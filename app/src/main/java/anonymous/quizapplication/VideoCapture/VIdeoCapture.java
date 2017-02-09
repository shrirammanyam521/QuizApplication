package anonymous.quizapplication.VideoCapture;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import anonymous.quizapplication.R;

public class VIdeoCapture extends AppCompatActivity {


    private Uri fileUri;
    private static final int MEDIA_TYPE_VIDEO = 2;
    private static final int CAPTURE_VIDEO_REQUEST_CODE = 200;
    public static VIdeoCapture vIdeoCapture = null;


    private Button btnRecordVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_capture);


        vIdeoCapture = this;

        btnRecordVideo = (Button) findViewById(R.id.btnRecordVideo);










        btnRecordVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);

                fileUri = getOutputMediaFileUri(MEDIA_TYPE_VIDEO);

                intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);

                intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);

                startActivityForResult(intent, CAPTURE_VIDEO_REQUEST_CODE);




            }
        });







    }


    private static Uri getOutputMediaFileUri(int type) {


        return Uri.fromFile(getOutputMediaFile(type));


    }



    private static File getOutputMediaFile(int type) {


        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "MyCameraVideo");


        if (!mediaStorageDir.exists()) {

            if (!mediaStorageDir.mkdir()) {


                Toast.makeText(vIdeoCapture, "Failed Create Directory MyCameraVideo", Toast.LENGTH_SHORT).show();

                return null;


            }


        }


        java.util.Date date = new Date();

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(date.getTime());


        File mediaFile;

        if (type == MEDIA_TYPE_VIDEO) {

            mediaFile = new File(mediaStorageDir.getPath()+File.separator+"VID"+timeStamp+".mp4");




        }else {


            return null;
        }


        return mediaFile;


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        if (requestCode == CAPTURE_VIDEO_REQUEST_CODE) {


            if (resultCode == RESULT_OK) {


                Toast.makeText(vIdeoCapture, "Video Saved Successfully", Toast.LENGTH_SHORT).show();
            } else if (resultCode == RESULT_CANCELED) {

                Toast.makeText(vIdeoCapture, "Video Canceled", Toast.LENGTH_SHORT).show();

            }else {


                Toast.makeText(vIdeoCapture, "Video Capture Failed", Toast.LENGTH_SHORT).show();
            }



        }





    }
}



