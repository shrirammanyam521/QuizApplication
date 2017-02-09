package anonymous.quizapplication.AudioCapture;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileDescriptor;
import java.io.IOException;

import anonymous.quizapplication.R;

public class AudioCapture extends AppCompatActivity {


    private MediaRecorder mediaRecorder;

    private Button btnRecord,btnPlay,btnStop;
    private String output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_capture);


        btnRecord = (Button) findViewById(R.id.btnRecord);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnStop = (Button) findViewById(R.id.btnStop);


        btnPlay.setEnabled(false);
        btnStop.setEnabled(false);

        output = Environment.getExternalStorageDirectory().getAbsolutePath() + "/myRecording.3gp";


        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mediaRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        mediaRecorder.setOutputFile(output);


        btnRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {

                    mediaRecorder.prepare();
                    mediaRecorder.start();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                btnRecord.setEnabled(false);
                btnStop.setEnabled(true);

                Toast.makeText(AudioCapture.this, "Recording Started", Toast.LENGTH_SHORT).show();


            }
        });


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MediaPlayer mediaPlayer = new MediaPlayer();

                try {

                    mediaPlayer.setDataSource(output);

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {

                    mediaPlayer.prepare();

                } catch (IOException e) {
                    e.printStackTrace();
                }


                mediaPlayer.start();

                Toast.makeText(AudioCapture.this, "Playing Audio", Toast.LENGTH_SHORT).show();


            }
        });


        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mediaRecorder.stop();
                mediaRecorder.release();
                mediaRecorder = null;

                btnStop.setEnabled(false);
                btnPlay.setEnabled(true);

                Toast.makeText(AudioCapture.this, "Audio Recorded Successfully", Toast.LENGTH_SHORT).show();


            }
        });










    }
}
