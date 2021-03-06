 package com.example.andreas.game;

        import android.content.Intent;
        import android.support.constraint.ConstraintLayout;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.CompoundButton;
        import android.widget.LinearLayout;
        import android.widget.Toast;

public class SkillsActivity extends AppCompatActivity {
    int numberOfCheckboxesChecked = 0;

    public static String textEtt;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_skills);


        final CheckBox Konfliktlösningsförmåga = (CheckBox) findViewById(R.id.Konfliktlösningsförmåga);
        final CheckBox Kommunikationsförmåga = (CheckBox) findViewById(R.id.Kommunikationsförmåga);
        final CheckBox Sammarbetsförmåga = (CheckBox) findViewById(R.id.Sammarbetsförmåga);
        final CheckBox Flexibel = (CheckBox) findViewById(R.id.Flexibel);
        final CheckBox Tålamod = (CheckBox) findViewById(R.id.Tålamod);
        final CheckBox Problemlösning = (CheckBox) findViewById(R.id.Problemlösning);
        final CheckBox Fokus = (CheckBox) findViewById(R.id.Fokus);
        final CheckBox Prioriteringsförmåga = (CheckBox) findViewById(R.id.Prioriteringsförmåga);
        final CheckBox Besluttagningförmåga = (CheckBox) findViewById(R.id.Besluttagningförmåga);
        final CheckBox Initiativtagare = (CheckBox) findViewById(R.id.Initiativtagare);
        final CheckBox Ansvarstagande = (CheckBox) findViewById(R.id.Ansvarstagande);
        final CheckBox Ledarskapsförmåga = (CheckBox) findViewById(R.id.Ledarskapsförmåga);




        final Button clickMe = (Button) findViewById(R.id.getGame);

        clickMe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                StringBuffer OUTPUT = new StringBuffer();
                OUTPUT.append("First skill:").append(Konfliktlösningsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Kommunikationsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Sammarbetsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Flexibel.isChecked());
                OUTPUT.append("First skill:").append(Tålamod.isChecked());
                OUTPUT.append("First skill:").append(Problemlösning.isChecked());
                OUTPUT.append("First skill:").append(Fokus.isChecked());
                OUTPUT.append("First skill:").append(Prioriteringsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Besluttagningförmåga.isChecked());
                OUTPUT.append("First skill:").append(Initiativtagare.isChecked());
                OUTPUT.append("First skill:").append(Ansvarstagande.isChecked());
                OUTPUT.append("First skill:").append(Ledarskapsförmåga.isChecked());


                if( !Tålamod.isChecked() && !Kommunikationsförmåga.isChecked() && !Konfliktlösningsförmåga.isChecked() && !Ansvarstagande.isChecked() && !Initiativtagare.isChecked() && !Prioriteringsförmåga.isChecked()){
                    textEtt = "Eh";
                }
                if((!Tålamod.isChecked() & !Konfliktlösningsförmåga.isChecked() & !Kommunikationsförmåga.isChecked() &  !Problemlösning.isChecked() & !Prioriteringsförmåga.isChecked()) & (Ansvarstagande.isChecked() | Initiativtagare.isChecked())){
                    textEtt = "Cs/LoL";
                }
                if((!Tålamod.isChecked() & !Problemlösning.isChecked() & !Kommunikationsförmåga.isChecked() & !Ansvarstagande.isChecked() & !Initiativtagare.isChecked() & !Ansvarstagande.isChecked()) & (Konfliktlösningsförmåga.isChecked() | (Prioriteringsförmåga.isChecked()))){
                    textEtt = "LoL/WoW";
                }
                if(( !Tålamod.isChecked() & !Konfliktlösningsförmåga.isChecked() & !Prioriteringsförmåga.isChecked() & !Ansvarstagande.isChecked() & !Initiativtagare.isChecked()) & (Kommunikationsförmåga.isChecked() | Problemlösning.isChecked())){
                    textEtt = "Cs/WoW";
                }
                if((!Ansvarstagande.isChecked() & !Initiativtagare.isChecked() & !Konfliktlösningsförmåga.isChecked() & !Prioriteringsförmåga.isChecked() & !Kommunikationsförmåga.isChecked() & !Problemlösning.isChecked()) & (Tålamod.isChecked())){
                    textEtt = "WoW";
                }
                if((!Initiativtagare.isChecked() & !Konfliktlösningsförmåga.isChecked() & !Prioriteringsförmåga.isChecked() & !Tålamod.isChecked()) & (Problemlösning.isChecked() & Ansvarstagande.isChecked())  | (Initiativtagare.isChecked() & Kommunikationsförmåga.isChecked())){
                    textEtt = "Cs";
                }
                if((!Tålamod.isChecked() & !Kommunikationsförmåga.isChecked() & !Problemlösning.isChecked() ) & ( Ansvarstagande.isChecked() & Prioriteringsförmåga.isChecked()) | (Konfliktlösningsförmåga.isChecked() & Ansvarstagande.isChecked())){
                    textEtt = "LoL";
                }
                startActivity(new Intent(getApplicationContext(),SResActivity.class));



            }

        });
        clickMe.setVisibility(View.INVISIBLE);

        Konfliktlösningsförmåga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Konfliktlösningsförmåga.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;

                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Kommunikationsförmåga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Kommunikationsförmåga.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Ansvarstagande.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Ansvarstagande.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Initiativtagare.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Initiativtagare.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Sammarbetsförmåga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Sammarbetsförmåga.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Prioriteringsförmåga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Prioriteringsförmåga.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Tålamod.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Tålamod.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });

        Flexibel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Flexibel.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Problemlösning.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Problemlösning.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Fokus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Fokus.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Prioriteringsförmåga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Prioriteringsförmåga.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Besluttagningförmåga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Besluttagningförmåga.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
        Ledarskapsförmåga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= 3) {
                    Ledarskapsförmåga.setChecked(false);
                } else {
                    // the checkbox either got unchecked
                    // or there are less than 2 other checkboxes checked
                    // change your counter accordingly
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                        clickMe.setVisibility(View.VISIBLE);
                    } else {
                        numberOfCheckboxesChecked--;
                        if (numberOfCheckboxesChecked == 0){
                            clickMe.setVisibility(View.INVISIBLE);
                        }
                    }

                    // now everything is fine and you can do whatever
                    // checking the checkbox should do here
                }
            }
        });
    }
}
