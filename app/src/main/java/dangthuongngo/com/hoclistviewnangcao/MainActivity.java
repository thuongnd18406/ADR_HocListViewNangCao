package dangthuongngo.com.hoclistviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import dangthuongngo.com.adapter.ContactAdapter;
import dangthuongngo.com.model.Contact;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addFakeData();
        addEvent();

    }

    private void addEvent() {
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact contact = contactAdapter.getItem(position);
                xuLigoi(contact);
            }
        });
    }

    private void xuLigoi(Contact contact) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + contact.getPhone()));
        startActivity(intent);
    }

    private void addFakeData() {
        contactAdapter.add(new Contact(R.drawable.capturea, "anh obanma", "0322135413"));
        contactAdapter.add(new Contact(R.drawable.captureb, "anh obanma", "0322135413"));
        contactAdapter.add(new Contact(R.drawable.capturec,"anh obanma","0322135413"));

    }

    private void addControl() {
        lvContact = findViewById((R.id.lvContact));
        contactAdapter = new ContactAdapter(MainActivity.this, R.layout.contact_item);
        lvContact.setAdapter(contactAdapter);
    }
}

