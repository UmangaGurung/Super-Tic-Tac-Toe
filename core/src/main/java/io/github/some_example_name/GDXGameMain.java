package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GDXGameMain extends ApplicationAdapter {
    private Skin skin;
    private Stage stage;
    private UIManager uiManager;

    @Override
    public void create() {
        // Initialize the skin and stage
        skin = new Skin(Gdx.files.internal("assets/uiskin.json"));
        stage = new Stage(new ScreenViewport());

        uiManager = new UIManager(stage, skin, this);
        // Set the input processor to the stage to handle touch and input events
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        // Update the stage viewport on resize
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void dispose() {
        stage.dispose();
        skin.dispose();
    }

    public void restartGame() {
        System.out.println("Restarting game...");
        dispose();  // Dispose of current resources
        create();   // Reinitialize the game
    }
}
