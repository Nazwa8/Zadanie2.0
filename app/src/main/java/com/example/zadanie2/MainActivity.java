package com.example.zadanie2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import kotlin.collections.IntIterator;

//testowanie commit 2.0.0.0.0.0

public class MainActivity extends AppCompatActivity {

    private EditText TekstImie;
    private EditText TekstNazwisko;
    private EditText TekstEmail;
    private EditText TekstTelefon;
    private EditText TekstHaslo;
    private EditText TekstHaslo2;
    private Button Submit;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TekstImie = findViewById(R.id.Imie);
        TekstNazwisko = findViewById(R.id.Nazwisko);
        TekstEmail = findViewById(R.id.Email);
        TekstTelefon = findViewById(R.id.Numer);
        TekstHaslo = findViewById(R.id.Haslo);
        TekstHaslo2 = findViewById(R.id.Haslo2);
        Submit = findViewById(R.id.Klik);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pobieranie danych
                String Imie = TekstImie.getText().toString().trim();
                String Nazwisko = TekstNazwisko.getText().toString().trim();
                String Email = TekstEmail.getText().toString().trim();
                String Numer = TekstTelefon.getText().toString().trim();
                String Haslo = TekstHaslo.getText().toString().trim();
                String Haslo2 = TekstHaslo2.getText().toString().trim();

                if (Imie.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić imię", Toast.LENGTH_SHORT).show();
                } else if (Nazwisko.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić nazwisko", Toast.LENGTH_SHORT).show();
                } else if
                (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
                    Toast.makeText(MainActivity.this, "Nie poprawny E-mail", Toast.LENGTH_SHORT).show();
                } else if (Numer.length() < 9) {
                    Toast.makeText(MainActivity.this, "Za krótki numer telefonu", Toast.LENGTH_SHORT).show();
                } else if (Haslo.length() < 6) {
                    Toast.makeText(MainActivity.this, "Za krótkie hasło", Toast.LENGTH_SHORT).show();
                } else if (!Haslo2.equals(Haslo)) {
                    Toast.makeText(MainActivity.this, "Hasła nie są identyczne", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}