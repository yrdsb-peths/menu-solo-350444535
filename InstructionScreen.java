import greenfoot.*;

public class InstructionScreen extends World {
    private MenuScreen menuScreen;  // A reference to the MenuScreen to return later

    public InstructionScreen(MenuScreen menuScreen) {
        super(600, 400, 1);
        this.menuScreen = menuScreen;  // Store the reference to the previous menu

        showText("Instructions:", 300, 100);  // Display a title
        showText("Use arrow keys to move.", 300, 150);
        showText("Press space to shoot.", 300, 200);
        showText("Avoid obstacles!", 300, 250);

        // Add a button to go back to the menu
        addObject(new Button(this::goBack), 300, 350);
    }

    public void goBack() {
        Greenfoot.setWorld(menuScreen);  // Switch back to the original MenuScreen
    }
}
