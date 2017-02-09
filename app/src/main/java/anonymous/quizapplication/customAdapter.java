package anonymous.quizapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class customAdapter extends ArrayAdapter<String> {

    private String[] urls;
    private Bitmap[] bitmaps;
    private Activity context;


    public customAdapter(Activity context, String[] urls,Bitmap[] bitmaps) {
        super(context, R.layout.image_list,urls);
        this.context = context;
        this.urls = urls;
        this.bitmaps = bitmaps;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View listViewItem = layoutInflater.inflate(R.layout.image_list, null,true);
        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.image);
        imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmaps[position],100,50,false));


        return listViewItem;
    }



}




