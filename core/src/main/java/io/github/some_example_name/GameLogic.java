package io.github.some_example_name;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import java.util.HashMap;

public class GameLogic {
    private Skin skin;
    private Stage stage;
    private GDXGameMain game;

    private boolean playable = true;
    private boolean player2turn;

    HashMap<Integer, GridStatus> gridsavailable= new HashMap<>();
    HashMap<Integer, TextButton[][]> allgridbuttons= new HashMap<>();

    GameLogic(HashMap<Integer, GridStatus> gridsavailable, HashMap<Integer, TextButton[][]> allgridbuttons, Stage stage, Skin skin, GDXGameMain game){
        this.stage=stage;
        this.skin=skin;
        this.gridsavailable=gridsavailable;
        this.allgridbuttons= allgridbuttons;
        this.game=game;
    }

    public void playerTurn(int i, TextButton button, int currentrow, int currentcol){
        GridStatus currentgridstatus = gridsavailable.get(i);
        if (playable && currentgridstatus.isAvailable() && !currentgridstatus.getImmutable() && button.getText().isEmpty()) {
            if (!player2turn) {
                button.setText("X");
                button.getLabel().setColor(Color.BLUE);
                switchCurrentGrid(i, currentrow, currentcol);
                checkGridWinCondition(i);
                player2turn = true;
            }else{
                button.setText("O");
                button.getLabel().setColor(Color.RED);
                switchCurrentGrid(i, currentrow, currentcol);
                checkGridWinCondition(i);
                player2turn = false;
            }
        }
    }

    private void switchCurrentGrid(int j, int rows, int cols) {
        if (rows==0 && cols==0){
            if (!gridsavailable.get(1).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 1) {
                        gridsavailable.get(1).setAvailable(true);
                        currentGridHighLight(1);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==0 && cols==1){
            if (!gridsavailable.get(2).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 2) {
                        gridsavailable.get(2).setAvailable(true);
                        currentGridHighLight(2);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==0 && cols==2){
            if (!gridsavailable.get(3).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 3) {
                        gridsavailable.get(3).setAvailable(true);
                        currentGridHighLight(3);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==1 && cols==0){
            if (!gridsavailable.get(4).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 4) {
                        gridsavailable.get(4).setAvailable(true);
                        currentGridHighLight(4);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==1 && cols==1){
            if (!gridsavailable.get(5).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 5) {
                        gridsavailable.get(5).setAvailable(true);
                        currentGridHighLight(5);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==1 && cols==2){
            if (!gridsavailable.get(6).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 6) {
                        gridsavailable.get(6).setAvailable(true);
                        currentGridHighLight(6);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==2 && cols==0){
            if (!gridsavailable.get(7).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 7) {
                        gridsavailable.get(7).setAvailable(true);
                        currentGridHighLight(7);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==2 && cols==1){
            if (!gridsavailable.get(8).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 8) {
                        gridsavailable.get(8).setAvailable(true);
                        currentGridHighLight(8);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            } else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
        if (rows==2 && cols==2){
            if (!gridsavailable.get(9).getImmutable()) {
                for (int i = 1; i <= 9; i++) {
                    if (i == 9) {
                        gridsavailable.get(9).setAvailable(true);
                        currentGridHighLight(9);
                        continue;
                    }
                    gridsavailable.get(i).setAvailable(false);
                }
            }else{
                for (int i = 1; i <= 9; i++) {
                    gridsavailable.get(i).setAvailable(true);
                }
            }
        }
    }

    private void checkGridWinCondition(int i){
        System.out.println("working"+i);
        TextButton[][] currentbuttoncheck= allgridbuttons.get(i);

        for (int k=1; k<=9; k++){
            System.out.print(gridsavailable.get(k).isAvailable()+",");
        }
        System.out.println();

        for (int k=0; k<3; k++){
            for (int j=0; j<3; j++){
                System.out.println(currentbuttoncheck[k][j]);
            }
        }
        //check win for X
        if (currentbuttoncheck[0][0].getText().toString().equals("X")
            && currentbuttoncheck[0][1].getText().toString().equals("X")
            && currentbuttoncheck[0][2].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }
        if (currentbuttoncheck[1][0].getText().toString().equals("X")
            && currentbuttoncheck[1][1].getText().toString().equals("X")
            && currentbuttoncheck[1][2].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }
        if (currentbuttoncheck[2][0].getText().toString().equals("X")
            && currentbuttoncheck[2][1].getText().toString().equals("X")
            && currentbuttoncheck[2][2].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }
        if (currentbuttoncheck[0][0].getText().toString().equals("X")
            && currentbuttoncheck[1][0].getText().toString().equals("X")
            && currentbuttoncheck[2][0].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }
        if (currentbuttoncheck[0][1].getText().toString().equals("X")
            && currentbuttoncheck[1][1].getText().toString().equals("X")
            && currentbuttoncheck[2][1].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }
        if (currentbuttoncheck[0][2].getText().toString().equals("X")
            && currentbuttoncheck[1][2].getText().toString().equals("X")
            && currentbuttoncheck[2][2].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }
        if (currentbuttoncheck[0][0].getText().toString().equals("X")
            && currentbuttoncheck[1][1].getText().toString().equals("X")
            && currentbuttoncheck[2][2].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }
        if (currentbuttoncheck[2][0].getText().toString().equals("X")
            && currentbuttoncheck[1][1].getText().toString().equals("X")
            && currentbuttoncheck[0][2].getText().toString().equals("X")){
            System.out.println("grid"+i+"belongs to x");
            changeGridColor(currentbuttoncheck, "X");
            checkGameWinCondition(i, "X");
        }

        //check win for O
        if (currentbuttoncheck[0][0].getText().toString().equals("O")
            && currentbuttoncheck[0][1].getText().toString().equals("O")
            && currentbuttoncheck[0][2].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
        if (currentbuttoncheck[1][0].getText().toString().equals("O")
            && currentbuttoncheck[1][1].getText().toString().equals("O")
            && currentbuttoncheck[1][2].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
        if (currentbuttoncheck[2][0].getText().toString().equals("O")
            && currentbuttoncheck[2][1].getText().toString().equals("O")
            && currentbuttoncheck[2][2].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
        if (currentbuttoncheck[0][0].getText().toString().equals("O")
            && currentbuttoncheck[1][0].getText().toString().equals("O")
            && currentbuttoncheck[2][0].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
        if (currentbuttoncheck[0][1].getText().toString().equals("O")
            && currentbuttoncheck[1][1].getText().toString().equals("O")
            && currentbuttoncheck[2][1].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
        if (currentbuttoncheck[0][2].getText().toString().equals("O")
            && currentbuttoncheck[1][2].getText().toString().equals("O")
            && currentbuttoncheck[2][2].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
        if (currentbuttoncheck[0][0].getText().toString().equals("O")
            && currentbuttoncheck[1][1].getText().toString().equals("O")
            && currentbuttoncheck[2][2].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
        if (currentbuttoncheck[2][0].getText().toString().equals("O")
            && currentbuttoncheck[1][1].getText().toString().equals("O")
            && currentbuttoncheck[0][2].getText().toString().equals("O")){
            System.out.println("grid"+i+"belongs to O");
            changeGridColor(currentbuttoncheck, "O");
            checkGameWinCondition(i, "O");
        }
    }

    private void checkGameWinCondition(int i, String player){
        gridsavailable.get(i).makeImmutable();
        if (player.equals("X")) {
            winCondition("X");
        }
        if (player.equals("O")) {
            winCondition("O");
        }
        System.out.println(playable);
    }

    private void winCondition(String player){

        if (gridsavailable.get(1).getImmutable()
            && gridsavailable.get(2).getImmutable()
            && gridsavailable.get(3).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }

        if (gridsavailable.get(4).getImmutable()
            && gridsavailable.get(5).getImmutable()
            && gridsavailable.get(6).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }

        if (gridsavailable.get(7).getImmutable()
            && gridsavailable.get(8).getImmutable()
            && gridsavailable.get(9).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }

        if (gridsavailable.get(1).getImmutable()
            && gridsavailable.get(4).getImmutable()
            && gridsavailable.get(7).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }

        if (gridsavailable.get(2).getImmutable()
            && gridsavailable.get(5).getImmutable()
            && gridsavailable.get(8).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }

        if (gridsavailable.get(3).getImmutable()
            && gridsavailable.get(6).getImmutable()
            && gridsavailable.get(9).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }

        if (gridsavailable.get(1).getImmutable()
            && gridsavailable.get(5).getImmutable()
            && gridsavailable.get(9).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }

        if (gridsavailable.get(3).getImmutable()
            && gridsavailable.get(5).getImmutable()
            && gridsavailable.get(7).getImmutable()) {
            playable = false;
            gameDialogBox(player);
        }
    }

    private void currentGridHighLight(int i){
        TextButton[][] currentbuttons= allgridbuttons.get(i);
        for (int k=0; k<3; k++){
            for (int j=0; j<3; j++){
                currentbuttons[k][j].addAction(
                    Actions.forever(Actions.sequence(
                        Actions.alpha(0.5f, 0.5f),
                        Actions.alpha(1f, 0.5f)
                    ))
                );
            }
        }
    }

    private void changeGridColor(TextButton[][] buttonscell, String player){
        if (player.equals("X")) {
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    buttonscell[i][j].setColor(Color.BLUE);
                }
            }
        }
        if (player.equals("O")) {
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    buttonscell[i][j].setColor(Color.RED);
                }
            }
        }
    }

    private void gameDialogBox(String player){
        Dialog dialog= new Dialog(player+" has won the game", skin){
            @Override
            protected void result(Object object) {
                if ((boolean) object) {
                    game.restartGame();
                } else {
                    System.out.println("Game Over. Exiting...");
                }
            }
        };
        dialog.setSize(1200, 1200); // Adjust width & height
        dialog.setPosition(
            Gdx.graphics.getWidth() / 2f - dialog.getWidth() / 2f,
            Gdx.graphics.getHeight() / 2f - dialog.getHeight() / 2f
        );

        dialog.text("Do you want to restart the game?").pad(20);

        dialog.button("Yes", true);
        dialog.button("No", false);

        dialog.show(stage);
    }
}

