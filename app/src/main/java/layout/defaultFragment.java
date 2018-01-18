package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.oneninedevelopers.glynkinterview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class defaultFragment extends Fragment {
    public static defaultFragment newInstance() {
        return new defaultFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_default, container, false);
        return view;
    }

}
