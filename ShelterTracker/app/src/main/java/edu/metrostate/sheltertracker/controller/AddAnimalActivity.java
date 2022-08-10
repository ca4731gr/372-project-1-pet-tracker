package edu.metrostate.sheltertracker.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.json.simple.parser.ParseException;

import java.io.IOException;

import edu.metrostate.sheltertracker.R;
import edu.metrostate.sheltertracker.domains.Animal;
import edu.metrostate.sheltertracker.domains.Shelter;
import edu.metrostate.sheltertracker.domains.ShelterTrackerApplication;

public class AddAnimalActivity extends AppCompatActivity {

    Button btAddAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);
    }



    public void importAnimal (View view) {
        Dialog dialog;
        Shelter shelter;
        if(shelter.getInTaking() == true){
            Animal animal = new Animal(animal_name, animal_id, weight, animal_type, receipt_date,release_date);
            shelter.addAnimal(animal);

            if(shelter.getAnimalList().contains(animal)){
                dialog = new AlertDialog.Builder(this).setTitle("adding animal").setCancelable(false)
                        .setMessage(animal.getAnimalId() + " Animal was added to " + shelter.getShelterName())
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.dismiss();
                                    }

                                }
            }
        }
    }
    public void backHome (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}