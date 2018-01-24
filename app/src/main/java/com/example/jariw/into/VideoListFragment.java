package com.example.jariw.into;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import com.example.jariw.into.content.YouTubeContent;


public class VideoListFragment extends ListFragment {


    public VideoListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new VideoListAdapter(getActivity()));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        final Context context = getActivity();
        final String DEVELOPER_KEY = getString(R.string.DEVELOPER_KEY);
        final YouTubeContent.YouTubeVideo video = YouTubeContent.ITEMS.get(position);

        switch (position) {
            case 0:
                final Intent lightboxIntent1 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent1.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent1);
                break;
            case 1:
                final Intent lightboxIntent2 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent2.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent2);
                break;
            case 2:
                final Intent lightboxIntent3 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent3.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent3);
                break;
            case 3:
                final Intent lightboxIntent4 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent4.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent4);
                break;
            case 4:
                final Intent lightboxIntent5 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent5.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent5);
                break;
            case 5:
                //Opens in Custom Activity
                final Intent lightboxIntent6 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent6.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent6);
                break;
            case 6:
                //Opens in the YouTubePlayerView
                final Intent lightboxIntent7 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent7.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent7);
                break;
            case 7:
                //Opens in the the custom Lightbox activity
                final Intent lightboxIntent = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent);
                break;
            case 8:
                //Custom player controls
                final Intent lightboxIntent8 = new Intent(getActivity(), CustomLightboxActivity.class);
                lightboxIntent8.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent8);
                break;

        }
    }

}
