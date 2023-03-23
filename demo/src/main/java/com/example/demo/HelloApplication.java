package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
//Declaring buttons  and Panes to be called in methods bellow the main class
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button head;
    Button bod;
    Button foot;
    HBox headerPane;
    VBox bodyPane;
    AnchorPane footerPane;
    TextField type;
    ImageView image;
    TextArea text;
    VBox rad;
    VBox chec;
    VBox large3;
    HBox large;
    HBox large4;
    VBox menu;
    Button menus;
    Pane header;
    Pane body;
    Pane footer;
    HBox largeP;

    @Override
    public void start(Stage stage) throws IOException {

        String file=getClass().getResource("logo.jpg").toExternalForm();

//Setting up a logo
        ImageView imageA=new ImageView();
        button1=new Button("Enter Logo");
        button1.setId("butn");
        button1.setPrefWidth(90);
        button1.setOnAction(this);
        button1.setOnAction(event -> {
            FileChooser chose=new FileChooser();
            var imgicon = chose.showOpenDialog(stage);
            Image imglogo=new Image(imgicon.getAbsolutePath());
            imageA.setImage(imglogo);
            imageA.setFitHeight(75);
            imageA.setFitWidth(75);
            headerPane.getChildren().add(imageA);
        });

        VBox.setMargin(button1,new Insets(5));

        button2=new Button("Submit");
        button2.setId("butn");
        button2.setPrefWidth(90);
        button2.setOnAction(this);
        VBox.setMargin(button2,new Insets(5));

        type=new TextField("Edit Header");

        type.setId("type");
        type.setMaxHeight(75);
        type.setPrefWidth(420);

        button3=new Button("CheckBox");
        button3.setId("butn");
        button3.setPrefWidth(90);
        button3.setOnAction(this);
        VBox.setMargin(button3,new Insets(5));

        menu=new VBox(3);
        menu.setPrefHeight(40);
        VBox.setMargin(menu,new Insets(5));

        menus=new Button("Add-Menu");
        menus.setId("butn");
        menus.setPrefWidth(90);
        menus.setOnAction(this);
        VBox.setMargin(menus,new Insets(5));

        button4=new Button("RadioButton");
        button4.setId("butn");
        button4.setPrefWidth(90);
        button4.setOnAction(this);
        VBox.setMargin(button4,new Insets(5));
//Colleting image from machine folders with button5
        button5=new Button("ChooseImg");
        button5.setPrefSize(Region.USE_COMPUTED_SIZE,60);
//   setting button as an image
        ImageView view = new ImageView(new Image("logo.jpg"));
        view.setFitHeight(60);
        view.setPreserveRatio(true);
//  linking image to button
        button5.setGraphic(view);
        button5.setContentDisplay(ContentDisplay.TOP);
        button5.setId("butn");
        button5.setPrefWidth(90);
        button5.setOnAction(event -> {
                FileChooser chooser=new FileChooser();
                var imgs = chooser.showOpenDialog(stage);
                Image img=new Image(imgs.getAbsolutePath());
                image.setImage(img);
                image.setFitWidth(180);
                largeP.getChildren().add(image);
        });
        VBox.setMargin(button5,new Insets(5));

        button6=new Button("TextArea");
        button6.setId("butn");
        button6.setPrefWidth(90);
        button6.setOnAction(this);
        VBox.setMargin(button6,new Insets(5));

        button7=new Button("TextField");
        button7.setId("butn");
        button7.setPrefWidth(90);
        button7.setOnAction(this);
        VBox.setMargin(button7,new Insets(5));

        button8=new Button("Buttons");
        button8.setId("butn");
        button8.setPrefWidth(90);
        button8.setOnAction(this);
        VBox.setMargin(button8,new Insets(5));

        image=new ImageView();
        image.setFitWidth(190);
        image.setFitHeight(190);

        rad=new VBox(10);
        VBox radio=new VBox(5);
        radio.setSpacing(5);
        rad.setPrefWidth(25);
        rad.getChildren().addAll(radio);

        chec=new VBox(10);
        VBox checkbox=new VBox(5);
        checkbox.setSpacing(5);
        checkbox.setPrefWidth(15);
        chec.setPrefWidth(25);
        chec.getChildren().addAll(checkbox);

        large=new HBox(10);
        large.setMaxHeight(225);
        largeP=new HBox(10);
        largeP.setMaxHeight(40);
        largeP.setAlignment(Pos.CENTER);
        VBox.setMargin(large,new Insets(5));

        large3=new VBox(10);
        large3.setAlignment(Pos.CENTER);
        large4=new HBox(10);
        VBox.setMargin(large4,new Insets(9));

//This is the WebView Structure Panes
        HBox nill=new HBox();
        HBox nill2=new HBox();//This is menu bar Drawing image through panes
        nill.setPrefHeight(5);
        nill2.setPrefHeight(5);
        headerPane=new HBox(5);
        headerPane.setPrefHeight(75);
        bodyPane=new VBox(5);
        bodyPane.setPrefHeight(520);
        bodyPane.getChildren().addAll(nill,menu,nill2,large,largeP,large4,large3);
        footerPane=new AnchorPane();
        footerPane.setPrefHeight(80);

//head,bod, and foot are the buttons set to give colors to Webpage
        head=new Button("Header");
        head.setOnAction(this);
        head.setPrefWidth(90);
        head.setId("butn");
        VBox.setMargin(head,new Insets(5));
        bod=new Button("Body");
        bod.setPrefWidth(90);
        bod.setId("butn");
        bod.setOnAction(this);
        VBox.setMargin(bod,new Insets(5));
        foot=new Button("Footer");
        foot.setPrefWidth(90);
        foot.setId("butn");
        foot.setOnAction(this);
        VBox.setMargin(foot,new Insets(5));
//Panes holds background color buttons:
        HBox panes = new HBox(10);
        panes.setMinHeight(60);
        panes.setStyle("-fx-background-color:Black");
        panes.setAlignment(Pos.CENTER);
        panes.getChildren().addAll(head,bod,foot);
        
        VBox webView = new VBox();
        webView.getChildren().addAll(headerPane,bodyPane,panes);
        webView.setPrefWidth(500);
        webView.setPrefHeight(700);
        webView.setId("webView");


        VBox start=new VBox(10);
        start.setPrefWidth(100);
        start.setId("start");
        start.getChildren().addAll(type,button2,button1,menus,button3,button4,button5,button6,button7,button8);
//Menu bar construction Panes
        header = new Pane();
        header.setId("footer");
        header.setMaxWidth(25);
        header.setPrefHeight(5);
        body = new Pane();
        body.setId("footer");
        body.setMaxWidth(25);
        body.setPrefHeight(5);
        footer = new Pane();
        footer.setId("footer");
        footer.setMaxWidth(25);
        footer.setPrefHeight(5);
//Dividing control buttons from Webview with HBox
        HBox pane = new HBox(5);
        pane.setPrefWidth(600);
        pane.getChildren().addAll(start,webView);

        Scene scene = new Scene(pane);
//CSS setup
        String style=getClass().getResource("/Style.css").toExternalForm();
        scene.getStylesheets().addAll(style);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    //Buttons Methods from outside main class
    @Override
    public void handle(ActionEvent event){
        if(event.getSource()==head){
            headerPane.setId("hh");
        }
        if(event.getSource()==bod){
            bodyPane.setId("bbc");
        }
        if(event.getSource()==foot){
            footerPane.setId("ff");
        }
        if(event.getSource()==button2){
            headerPane.getChildren().add(type);
        }

        if(event.getSource()==button3){
                CheckBox bttn=new CheckBox();
                chec.getChildren().add(bttn);
                large.getChildren().add(chec);
            }

        if(event.getSource()==button4){
            RadioButton btn=new RadioButton();
            rad.getChildren().add(btn);
            large.getChildren().add(rad);
        }
        if(event.getSource()==button6){
            TextArea text = new TextArea();
            text.setPrefWidth(400);
            text.setMaxHeight(200);
            large.getChildren().add(text);
        }
        if(event.getSource()==button7){
            TextField textField=new TextField("Type here");
            textField.setMaxWidth(180);
            large3.getChildren().addAll(textField);
        }
        if(event.getSource()==button8){
            Button choosebtn=new Button("Button");
            choosebtn.setId("butn");
            choosebtn.setPrefWidth(80);
            large4.getChildren().addAll(choosebtn);
        }
        if(event.getSource()==menus){
            menu.setId("menu");
            menu.getChildren().addAll(footer,body,header);
        }
    }
}