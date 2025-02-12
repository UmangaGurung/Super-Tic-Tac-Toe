package io.github.some_example_name;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import java.util.HashMap;

public class UIManager {
    private Skin skin;
    private Stage stage;
    private GameLogic gamelogic;
    private GDXGameMain game;

    private TextButton[][] buttonscell1;
    private TextButton[][] buttonscell2;
    private TextButton[][] buttonscell3;
    private TextButton[][] buttonscell4;
    private TextButton[][] buttonscell5;
    private TextButton[][] buttonscell6;
    private TextButton[][] buttonscell7;
    private TextButton[][] buttonscell8;
    private TextButton[][] buttonscell9;

    private Table outertable;
    private Table innertable1;
    private Table innertable2;
    private Table innertable3;
    private Table innertable4;
    private Table innertable5;
    private Table innertable6;
    private Table innertable7;
    private Table innertable8;
    private Table innertable9;

    HashMap<Integer, GridStatus> gridsavailable= new HashMap<>();
    HashMap<Integer, TextButton[][]> allgridbuttons= new HashMap<>();

    private GridStatus[] gridstatus;

    public UIManager(Stage stage, Skin skin, GDXGameMain game) {
        this.skin= skin;
        this.stage= stage;
        this.game=game;

        outertable = new Table();
        outertable.setFillParent(true);
        stage.addActor(outertable);

        gridstatus = new GridStatus[10];

        for (int i=1; i<=9; i++){
            gridstatus[i]= new GridStatus(true);
            gridsavailable.put(i, gridstatus[i]);
        }

        createGrids(skin);
        gamelogic= new GameLogic(gridsavailable,allgridbuttons,stage,skin,game);
    }

    private void createGrids(Skin skin){
        innertable1 = new Table();
        buttonscell1 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                //Initializing final variables to be used for the anonymous class
                final int currentrow= row;
                final int currentcol = col;

                buttonscell1[row][col] = new TextButton("", skin);
                TextButton button = buttonscell1[row][col];
                button.clearActions();
                // ActionListener to listen to actions made against the buttons
                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(1, buttonscell1);
                        gamelogic.playerTurn(1, button, currentrow, currentcol);
                    }
                });

                innertable1.add(button).expand().fill().pad(5);
            }
            innertable1.row();
        }

        //
        innertable2 = new Table();
        buttonscell2 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell2[row][col] = new TextButton("", skin);
                TextButton button = buttonscell2[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(2, buttonscell2);
                        gamelogic.playerTurn(2, button, currentrow, currentcol);
                    }
                });
                innertable2.add(button).expand().fill().pad(5);
            }
            innertable2.row();
        }

        //
        innertable3 = new Table();
        buttonscell3 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell3[row][col] = new TextButton("", skin);
                TextButton button = buttonscell3[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(3, buttonscell3);
                        gamelogic.playerTurn(3, button, currentrow, currentcol);
                    }
                });
                innertable3.add(button).expand().fill().pad(5);
            }
            innertable3.row();
        }

        //
        innertable4 = new Table();
        buttonscell4 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell4[row][col] = new TextButton("", skin);
                TextButton button = buttonscell4[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(4, buttonscell4);
                        gamelogic.playerTurn(4, button, currentrow, currentcol);
                    }
                });
                innertable4.add(button).expand().fill().pad(5);
            }
            innertable4.row();
        }

        //
        innertable5 = new Table();
        buttonscell5 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell5[row][col] = new TextButton("", skin);
                TextButton button = buttonscell5[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(5, buttonscell5);
                        gamelogic.playerTurn(5, button, currentrow, currentcol);
                    }
                });
                innertable5.add(button).expand().fill().pad(5);
            }
            innertable5.row();
        }

        //
        innertable6 = new Table();
        buttonscell6 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell6[row][col] = new TextButton("", skin);
                TextButton button = buttonscell6[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(6, buttonscell6);
                        gamelogic.playerTurn(6, button, currentrow, currentcol);
                    }
                });
                innertable6.add(button).expand().fill().pad(5);
            }
            innertable6.row();
        }

        //
        innertable7 = new Table();
        buttonscell7 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell7[row][col] = new TextButton("", skin);
                TextButton button = buttonscell7[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(7, buttonscell7);
                        gamelogic.playerTurn(7, button, currentrow, currentcol);
                    }
                });
                innertable7.add(button).expand().fill().pad(5);
            }
            innertable7.row();
        }

        //
        innertable8 = new Table();
        buttonscell8 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell8[row][col] = new TextButton("", skin);
                TextButton button = buttonscell8[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(8, buttonscell8);
                        gamelogic.playerTurn(8, button, currentrow, currentcol);
                    }
                });
                innertable8.add(button).expand().fill().pad(5);
            }
            innertable8.row();
        }

        //
        innertable9 = new Table();
        buttonscell9 = new TextButton[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int currentrow= row;
                final int currentcol = col;

                buttonscell9[row][col] = new TextButton("", skin);
                TextButton button = buttonscell9[row][col];

                button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener() {
                    @Override
                    public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
                        clearAnimation(9, buttonscell9);
                        gamelogic.playerTurn(9, button, currentrow, currentcol);
                    }
                });
                innertable9.add(button).expand().fill().pad(5);
            }
            innertable9.row();
        }

        outertable.add(innertable1).expand().fill().pad(10);
        outertable.add(innertable2).expand().fill().pad(10);
        outertable.add(innertable3).expand().fill().pad(10);
        outertable.row();
        outertable.add(innertable4).expand().fill().pad(10);
        outertable.add(innertable5).expand().fill().pad(10);
        outertable.add(innertable6).expand().fill().pad(10);
        outertable.row();
        outertable.add(innertable7).expand().fill().pad(10);
        outertable.add(innertable8).expand().fill().pad(10);
        outertable.add(innertable9).expand().fill().pad(10);

        allgridbuttons.put(1, buttonscell1);
        allgridbuttons.put(2, buttonscell2);
        allgridbuttons.put(3, buttonscell3);
        allgridbuttons.put(4, buttonscell4);
        allgridbuttons.put(5, buttonscell5);
        allgridbuttons.put(6, buttonscell6);
        allgridbuttons.put(7, buttonscell7);
        allgridbuttons.put(8, buttonscell8);
        allgridbuttons.put(9, buttonscell9);
    }

    private void clearAnimation(int i, TextButton[][] buttonscell){
        if (!gridsavailable.get(i).getImmutable()) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    buttonscell[j][k].clearActions();
                    buttonscell[j][k].setColor(Color.WHITE);
                }
            }
        }
    }
}
