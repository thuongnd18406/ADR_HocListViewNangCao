package dangthuongngo.com.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import dangthuongngo.com.hoclistviewnangcao.R;
import dangthuongngo.com.model.Contact;

public class ContactAdapter extends ArrayAdapter<Contact> {
    Activity context;
    int resource;

    /**
     * constructure dể khởi tạo adapter
     * @param context  :màn hình naod
     * @param resource
     */
    public ContactAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context=context;
        this.resource=resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View custom=context.getLayoutInflater().inflate(resource,null);
        //Luuw ý ImageView (imgAvata, txtname, phone
        //cả 3 nằm trong custom, không phải chổ khác
        //
        ImageView imgAvata=custom.findViewById(R.id.imgAvata);
        TextView txtName=custom.findViewById(R.id.txtName);
        TextView txtPhone=custom.findViewById(R.id.txtPhone);

        //cái đối số tên possion ở trên là vị trí dữ liệu đang được nhân bản
        Contact contact=getItem(position);
        imgAvata.setImageResource(contact.getAvatar());
        txtName.setText(contact.getName());

        return custom;
    }
}
