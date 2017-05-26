package com.example.amcidsolutions.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    int turn=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt1.setText("O");
                    }
                }
                endGame();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt2.setText("O");
                    }
                }

                endGame();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt3.setText("O");
                    }
                }
                endGame();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt4.setText("O");
                    }
                }
                endGame();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt5.setText("O");
                    }
                }
                endGame();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt6.setText("O");
                    }
                }
                endGame();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt7.setText("O");
                    }
                }
                endGame();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt8.setText("O");
                    }
                }

                endGame();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        bt9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        bt9.setText("O");
                    }
                }
                endGame();
            }
        });
    }

    public void endGame()
    {
        String a,b,c,d,e,f,g,h,i;
        boolean end=false;
        a=bt1.getText().toString();
        b=bt2.getText().toString();
        c=bt3.getText().toString();
        d=bt4.getText().toString();
        e=bt5.getText().toString();
        f=bt6.getText().toString();
        g=bt7.getText().toString();
        h=bt8.getText().toString();
        i=bt9.getText().toString();

        if(a.equals(b) && a.equals(c) && a.equals("X")&& b.equals("X")&& c.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals(e) && a.equals(i) && a.equals("X")&& e.equals("X")&& i.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals(d) && a.equals(g) && a.equals("X")&& d.equals("X")&& g.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals(e) && b.equals(h) && a.equals("X")&& e.equals("X")&& h.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals(f) && c.equals(i) && a.equals("X")&& f.equals("X")&& i.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals(e) && c.equals(g) && c.equals("X")&& e.equals("X")&& g.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals(e) && d.equals(f) && a.equals("X")&& e.equals("X")&& f.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals(h) && g.equals(i) && a.equals("X")&& h.equals("X")&& i.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }

        if(a.equals(b) && a.equals(c) && a.equals("O")&& b.equals("O")&& c.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals(e) && a.equals(i) && a.equals("O")&& e.equals("O")&& i.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals(d) && a.equals(g) && a.equals("O")&& d.equals("O")&& g.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals(e) && b.equals(h) && a.equals("O")&& e.equals("O")&& h.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals(f) && c.equals(i) && a.equals("O")&& f.equals("O")&& i.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals(e) && c.equals(g) && c.equals("O")&& e.equals("O")&& g.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals(e) && d.equals(f) && a.equals("O")&& e.equals("O")&& f.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals(h) && g.equals(i) && a.equals("O")&& h.equals("O")&& i.equals("O"))
        {
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }

        if(end) {
            bt1.setEnabled(false);
            bt2.setEnabled(false);
            bt3.setEnabled(false);
            bt4.setEnabled(false);
            bt5.setEnabled(false);
            bt6.setEnabled(false);
            bt7.setEnabled(false);
            bt8.setEnabled(false);
            bt9.setEnabled(false);
        }
    }
}
