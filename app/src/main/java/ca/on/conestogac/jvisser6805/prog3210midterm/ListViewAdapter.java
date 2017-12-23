package ca.on.conestogac.jvisser6805.prog3210midterm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListViewAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public ListViewAdapter(Context context, String[] values) {
        super(context, -1, values);

        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);

        TextView value = (TextView) rowView.findViewById(R.id.valueTextView);

        value.setText(values[position]);

        return rowView;
    }
}

