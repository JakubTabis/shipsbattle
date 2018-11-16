package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        GridPane gridPane = new GridPane();
        GridPane gridPane2 = new GridPane();
        gridPane2.setVgap(5);
        gridPane2.setHgap(5);
        gridPane2.setAlignment(Pos.CENTER_RIGHT);


        List<Ship> ownShipsList = new ArrayList<>();
        List<Button> allButtons = new ArrayList<>();

        List<Button> ownbuttonsList4 = new ArrayList();
        List<Button> ownremovedButtonsList4 = new ArrayList();
        List<Button> ownbuttonsList3a = new ArrayList();
        List<Button> ownremovedButtonsList3a = new ArrayList();
        List<Button> ownbuttonsList3b = new ArrayList();
        List<Button> ownremovedButtonsList3b = new ArrayList();
        List<Button> ownbuttonsList2a = new ArrayList();
        List<Button> ownremovedButtonsList2a = new ArrayList();
        List<Button> ownbuttonsList2b = new ArrayList();
        List<Button> ownremovedButtonsList2b = new ArrayList();
        List<Button> ownbuttonsList2c = new ArrayList();
        List<Button> ownremovedButtonsList2c = new ArrayList();
        List<Button> ownbuttonsList1a = new ArrayList();
        List<Button> ownremovedButtonsList1a = new ArrayList();
        List<Button> ownbuttonsList1b = new ArrayList();
        List<Button> ownremovedButtonsList1b = new ArrayList();
        List<Button> ownbuttonsList1c = new ArrayList();
        List<Button> ownremovedButtonsList1c = new ArrayList();
        List<Button> ownbuttonsList1d = new ArrayList();
        List<Button> ownremovedButtonsList1d = new ArrayList();


        enemyShipsList(ownShipsList, ownbuttonsList4, ownremovedButtonsList4, ownbuttonsList3a, ownremovedButtonsList3a,
                ownbuttonsList3b, ownremovedButtonsList3b, ownbuttonsList2a, ownremovedButtonsList2a, ownbuttonsList2b,
                ownremovedButtonsList2b, ownbuttonsList2c, ownremovedButtonsList2c, ownbuttonsList1a, ownremovedButtonsList1a,
                ownbuttonsList1b, ownremovedButtonsList1b, ownbuttonsList1c, ownremovedButtonsList1c, ownbuttonsList1d,
                ownremovedButtonsList1d);
        generateEnemyShips(gridPane, allButtons, ownbuttonsList4, ownbuttonsList3a, ownbuttonsList3b, ownbuttonsList2a,
                ownbuttonsList2b, ownbuttonsList2c, ownbuttonsList1a, ownbuttonsList1b, ownbuttonsList1c, ownbuttonsList1d);


        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER_LEFT);


        List<String> coords = new ArrayList<>();
        List<Ship> shipsList = new ArrayList<>();

        List<Button> buttonsList4 = new ArrayList();
        List<Button> removedButtonsList4 = new ArrayList();
        List<Button> buttonsList3a = new ArrayList();
        List<Button> removedButtonsList3a = new ArrayList();
        List<Button> buttonsList3b = new ArrayList();
        List<Button> removedButtonsList3b = new ArrayList();
        List<Button> buttonsList2a = new ArrayList();
        List<Button> removedButtonsList2a = new ArrayList();
        List<Button> buttonsList2b = new ArrayList();
        List<Button> removedButtonsList2b = new ArrayList();
        List<Button> buttonsList2c = new ArrayList();
        List<Button> removedButtonsList2c = new ArrayList();
        List<Button> buttonsList1a = new ArrayList();
        List<Button> removedButtonsList1a = new ArrayList();
        List<Button> buttonsList1b = new ArrayList();
        List<Button> removedButtonsList1b = new ArrayList();
        List<Button> buttonsList1c = new ArrayList();
        List<Button> removedButtonsList1c = new ArrayList();
        List<Button> buttonsList1d = new ArrayList();
        List<Button> removedButtonsList1d = new ArrayList();


        playerShips(shipsList, buttonsList4, removedButtonsList4, buttonsList3a, removedButtonsList3a, buttonsList3b, removedButtonsList3b, buttonsList2a, removedButtonsList2a, buttonsList2b, removedButtonsList2b, buttonsList2c, removedButtonsList2c, buttonsList1a, removedButtonsList1a, buttonsList1b, removedButtonsList1b, buttonsList1c, removedButtonsList1c, buttonsList1d, removedButtonsList1d);

        for (int rows = 0; rows < 10; rows++){
            for (int cols = 0; cols <10; cols++ ){
                Button button = new Button();
                button.setText(rows+"x"+cols);
                button.getText();
                gridPane.add(button, rows, cols);
                generateOwnShips(buttonsList4, buttonsList3a, buttonsList3b, buttonsList2a, buttonsList2b, buttonsList2c, buttonsList1a, buttonsList1b, buttonsList1c, buttonsList1d, rows, cols, button);
                onClickAction(ownShipsList, allButtons, coords, shipsList, button);
            }
        }

        HBox hBox = new HBox();
        hBox.getChildren().addAll(gridPane2, gridPane);
        Scene scene = new Scene(hBox);
        stage.setScene(scene);
        stage.show();
    }

    private void enemyShipsList(List<Ship> ownShipsList, List<Button> ownbuttonsList4, List<Button> ownremovedButtonsList4, List<Button> ownbuttonsList3a, List<Button> ownremovedButtonsList3a, List<Button> ownbuttonsList3b, List<Button> ownremovedButtonsList3b, List<Button> ownbuttonsList2a, List<Button> ownremovedButtonsList2a, List<Button> ownbuttonsList2b, List<Button> ownremovedButtonsList2b, List<Button> ownbuttonsList2c, List<Button> ownremovedButtonsList2c, List<Button> ownbuttonsList1a, List<Button> ownremovedButtonsList1a, List<Button> ownbuttonsList1b, List<Button> ownremovedButtonsList1b, List<Button> ownbuttonsList1c, List<Button> ownremovedButtonsList1c, List<Button> ownbuttonsList1d, List<Button> ownremovedButtonsList1d) {
        Ship ownship4 = new Ship(ownbuttonsList4, 4, ownremovedButtonsList4);
        ownShipsList.add(ownship4);
        Ship ownship3a = new Ship(ownbuttonsList3a, 3, ownremovedButtonsList3a);
        ownShipsList.add(ownship3a);
        Ship ownship3b = new Ship(ownbuttonsList3b, 3, ownremovedButtonsList3b);
        ownShipsList.add(ownship3b);
        Ship ownship2a = new Ship(ownbuttonsList2a, 2, ownremovedButtonsList2a);
        ownShipsList.add(ownship2a);
        Ship ownship2b = new Ship(ownbuttonsList2b, 2, ownremovedButtonsList2b);
        ownShipsList.add(ownship2b);
        Ship ownship2c = new Ship(ownbuttonsList2c, 2, ownremovedButtonsList2c);
        ownShipsList.add(ownship2c);
        Ship ownship1a = new Ship(ownbuttonsList1a, 1, ownremovedButtonsList1a);
        ownShipsList.add(ownship1a);
        Ship ownship1b = new Ship(ownbuttonsList1b, 1, ownremovedButtonsList1b);
        ownShipsList.add(ownship1b);
        Ship ownship1c = new Ship(ownbuttonsList1c, 1, ownremovedButtonsList1c);
        ownShipsList.add(ownship1c);
        Ship ownship1d = new Ship(ownbuttonsList1d, 1, ownremovedButtonsList1d);
        ownShipsList.add(ownship1d);
    }

    private void playerShips(List<Ship> shipsList, List<Button> buttonsList4, List<Button> removedButtonsList4, List<Button> buttonsList3a, List<Button> removedButtonsList3a, List<Button> buttonsList3b, List<Button> removedButtonsList3b, List<Button> buttonsList2a, List<Button> removedButtonsList2a, List<Button> buttonsList2b, List<Button> removedButtonsList2b, List<Button> buttonsList2c, List<Button> removedButtonsList2c, List<Button> buttonsList1a, List<Button> removedButtonsList1a, List<Button> buttonsList1b, List<Button> removedButtonsList1b, List<Button> buttonsList1c, List<Button> removedButtonsList1c, List<Button> buttonsList1d, List<Button> removedButtonsList1d) {
        Ship ship4 = new Ship(buttonsList4, 4, removedButtonsList4);
        shipsList.add(ship4);
        Ship ship3a = new Ship(buttonsList3a, 3, removedButtonsList3a);
        shipsList.add(ship3a);
        Ship ship3b = new Ship(buttonsList3b, 3, removedButtonsList3b);
        shipsList.add(ship3b);
        Ship ship2a = new Ship(buttonsList2a, 2, removedButtonsList2a);
        shipsList.add(ship2a);
        Ship ship2b = new Ship(buttonsList2b, 2, removedButtonsList2b);
        shipsList.add(ship2b);
        Ship ship2c = new Ship(buttonsList2c, 2, removedButtonsList2c);
        shipsList.add(ship2c);
        Ship ship1a = new Ship(buttonsList1a, 1, removedButtonsList1a);
        shipsList.add(ship1a);
        Ship ship1b = new Ship(buttonsList1b, 1, removedButtonsList1b);
        shipsList.add(ship1b);
        Ship ship1c = new Ship(buttonsList1c, 1, removedButtonsList1c);
        shipsList.add(ship1c);
        Ship ship1d = new Ship(buttonsList1d, 1, removedButtonsList1d);
        shipsList.add(ship1d);
    }

    private void generateOwnShips(List<Button> buttonsList4, List<Button> buttonsList3a, List<Button> buttonsList3b, List<Button> buttonsList2a, List<Button> buttonsList2b, List<Button> buttonsList2c, List<Button> buttonsList1a, List<Button> buttonsList1b, List<Button> buttonsList1c, List<Button> buttonsList1d, int rows, int cols, Button button) {
        if (cols == 0 && rows >= 2 && rows <= 5){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList4.add(button);
        } else if (cols == 4 && rows >= 2 && rows <= 4){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList3a.add(button);
        } else if (cols == 9 && rows >= 2 && rows <= 4){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList3b.add(button);
        } else if (rows == 8 && cols >= 2 && cols <= 3){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList2a.add(button);
        } else if (rows == 6 && cols >= 6 && cols <= 7){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList2b.add(button);
        } else if (rows == 9 && cols >= 8 && cols <= 9){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList2c.add(button);
        } else if (cols == 9 && rows == 0){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList1a.add(button);
        } else if (cols == 5 && rows == 9){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList1b.add(button);
        } else if (cols == 0 && rows == 9){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList1c.add(button);
        } else if (cols == 2 && rows == 2){
            //button.setStyle("-fx-background-color: #ed1a99; ");
            buttonsList1d.add(button);
        }
    }

    private void onClickAction(List<Ship> ownShipsList, List<Button> allButtons, List<String> coords, List<Ship> shipsList, Button button) {
        button.setOnMouseClicked(e -> {
            Button clickedButton = (Button) e.getSource();

            boolean isFound = false;
            for (Ship ship : shipsList) {
                for (Button oneButton : ship.getButtons()) {
                    isFound = playerHitEnemy(allButtons, shipsList, button, clickedButton, isFound, ship, oneButton);
                }
            }

            if (isFound == false){
                System.out.println("Computer's turn");
                clickedButton.setStyle("-fx-background-color: #dadcac; ");

                boolean computerMove = false;
                do {
                    computerMove = false;
                    Random rand = new Random();
                    Button randomElement = allButtons.get(rand.nextInt(allButtons.size()));
                    randomElement.setStyle("-fx-background-color: #dadcac; ");
                    allButtons.remove(randomElement);

                    System.out.println("Comp" + randomElement);
                    boolean isInLoop = false;
                    for (Ship ownShip : ownShipsList) {
                        for (Button currentButton : ownShip.getButtons()) {
                            if (randomElement == currentButton) {
                                System.out.println("Computer hit your ship");
                                computerMove = true;
                                isInLoop = true;
                                randomElement.setStyle("-fx-background-color: #ffff00; ");
                                ownShip.getButtons().remove(currentButton);
                                ownShip.getRemovedButtons().add(currentButton);
                                if (ownShip.getButtons().size() == 0){
                                    System.out.println("Computer destroyed your ship!");
                                    System.out.println(ownShip);

                                    int count = 0;
                                    for (Ship ship : ownShipsList){
                                        if (ship.getButtons().size() != 0){
                                            count++;
                                        }
                                    }
                                    if (count == 0){
                                        System.out.println("You lost!");
                                        for (Button button1 : allButtons){
                                            button1.setText("+");
                                        }
                                    }
                                    for (Button removedButton : ownShip.getRemovedButtons()){
                                        removedButton.setStyle("-fx-background-color: #000000; ");
                                    }
                                }
                            }
                        }
                    }
                    if (isInLoop == false) {
                        randomElement.setStyle("-fx-background-color: #7fffd4; ");
                    }
                }while (computerMove != false);
            }

            String value = clickedButton.getText();
            System.out.println(value);
            coords.add(value);
        });
    }

    private boolean playerHitEnemy(List<Button> allButtons, List<Ship> shipsList, Button button, Button clickedButton, boolean isFound, Ship ship, Button oneButton) {
        if (clickedButton == oneButton) {
            button.setStyle("-fx-background-color: #008000; ");
            ship.getButtons().remove(clickedButton);
            ship.getRemovedButtons().add(clickedButton);
            isFound = true;
            if (ship.getButtons().size() == 0){
                System.out.println("You killed enemy ship!");
                System.out.println(ship);

                int count = 0;
                for (Ship oneShip : shipsList){
                    if (oneShip.getButtons().size() != 0){
                        count++;
                    }
                }
                if (count == 0){
                    System.out.println("You win!");
                    for (Button button1 : allButtons){
                        button1.setText("+");
                    }
                }
                for (Button removedButton : ship.getRemovedButtons()){
                    removedButton.setStyle("-fx-background-color: #22271b; ");
                }
            }
        }
        return isFound;
    }

    private void generateEnemyShips(GridPane gridPane, List<Button> allButtons, List<Button> ownbuttonsList4, List<Button> ownbuttonsList3a, List<Button> ownbuttonsList3b, List<Button> ownbuttonsList2a, List<Button> ownbuttonsList2b, List<Button> ownbuttonsList2c, List<Button> ownbuttonsList1a, List<Button> ownbuttonsList1b, List<Button> ownbuttonsList1c, List<Button> ownbuttonsList1d) {
        for (int rows = 10; rows < 20; rows++) {
            for (int cols = 10; cols < 20; cols++) {
                Button ownButton = new Button();
                ownButton.setText(rows + "x" + cols);
                ownButton.getText();
                gridPane.add(ownButton, rows, cols);
                allButtons.add(ownButton);

                if (cols == 10 && rows >= 12 && rows <= 15) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList4.add(ownButton);
                } else if (cols == 14 && rows >= 12 && rows <= 14) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList3a.add(ownButton);
                } else if (cols == 19 && rows >= 12 && rows <= 14) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList3b.add(ownButton);
                } else if (rows == 18 && cols >= 12 && cols <= 13) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList2a.add(ownButton);
                } else if (rows == 16 && cols >= 16 && cols <= 17) {
                   // ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList2b.add(ownButton);
                } else if (rows == 19 && cols >= 18 && cols <= 19) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList2c.add(ownButton);
                } else if (cols == 19 && rows == 10) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList1a.add(ownButton);
                } else if (cols == 15 && rows == 19) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList1b.add(ownButton);
                } else if (cols == 10 && rows == 19) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList1c.add(ownButton);
                } else if (cols == 12 && rows == 12) {
                    //ownButton.setStyle("-fx-background-color: #ed1a99; ");
                    ownbuttonsList1d.add(ownButton);
                }


            }
        }
    }

    public static void main(String args[]){
        launch(args);
    }
}
