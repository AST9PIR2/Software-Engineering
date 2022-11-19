package se1.hu5.javafx;

import javafx.geometry.Insets;
import java.text.DecimalFormat;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;



// Eine JavaFX-Applikation erbt von Application..
public class Temperaturkonverter extends Application{
	
	// start() wird indirekt vom FX-System aufgerufen, nachdem (zB. in main() ) die methode 'launch()' aufgerufen wird.
	// Mitgegeben wird das "Bühnenobjekt" primaryStage, auf der dann Szenen stattfinden ...
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	// I.) GUI-Komponenten instanziieren, konfigurieren
	// ***********************************************
		
		// Im GridPane werden GUI-Komponenten an einem Gitter ausgerichtet
		GridPane grid = new GridPane();
		
		// Abstand vom Gitter zum Fensterrahmen
		grid.setPadding(new Insets(10,10,10,10));
		
		// Stärke der Zellentrennwände im Gitter
		grid.setHgap(8);
		grid.setVgap(8);



		// CSS-like Style anwenden, um die Gitternetzlinien sichtbar zu machen. 
		// Ggf. Kommentar entfernen, um Gridlinien anzuzeigen
		//grid.setStyle("-fx-background-color: gray; -fx-grid-lines-visible: true;");
	
		// Komponente Button instanziieren und konfigurieren
		Button convertBtn = new Button();
		convertBtn.setText("Convert");		
		// Komponente Button der Komponente Grid hinzufügen. Wird spaeter in Zelle 0,2 angezeigt
		grid.add(convertBtn,  0,2);

		Button convert30Btn = new Button();
		convert30Btn.setText("30 Grad");
		// Komponente Button der Komponente Grid hinzufügen. Wird spaeter in Zelle 3,3 angezeigt
		grid.add(convert30Btn,  3,3);

		Button convert60Btn = new Button();
		convert60Btn.setText("60 Grad");
		// Komponente Button der Komponente Grid hinzufügen. Wird spaeter in Zelle 3,4 angezeigt
		grid.add(convert60Btn,  3,4);
		
		
		TextField inputTxf = new TextField();
		grid.add(inputTxf,  0,1);

		Label resultLbl = new Label();
		resultLbl.setStyle("-fx-font: 24 arial;");  // CSS-like 
		grid.add(resultLbl,  0,3);	
	
		// Gruppe an zusammengehörenden Radio Buttons: 
		// Wird einer "reingedrückt" (=angewählt), springen die anderen heraus (=abgewählt).
		ToggleGroup radioButtons = new ToggleGroup();
		
		RadioButton celsiusRdb = new RadioButton("F -> C");
		celsiusRdb.setSelected(true);  // Button "reindrücken"
		celsiusRdb.setToggleGroup(radioButtons);  // Button der Gruppe zuweisen
		grid.add(celsiusRdb,  3,1);	

		RadioButton fahrenheitRdb = new RadioButton("C -> F");
		fahrenheitRdb.setToggleGroup(radioButtons);
		grid.add(fahrenheitRdb,  3,2);	

			
		
		// II.) Ereignisbehandler (Event Handler) "verdrahten"
		// ***************************************************		
		
		// Hier wird simpel (=kein MVC!) der Button mit einem Ereignisverarbeiter verdrahtet, der bei Mausklicks ausgeführt wird.
		// Und zwar mit einer Lambda-Funktion, nach folgender Leseart:
		// Das funktionale Interface vom Typ "ActionEvent" mit genau einer Methode "handle(Action event)"
		// wird hier anonym (hinter dem "->") implementiert.
		convert30Btn.setOnAction( event -> {
			inputTxf.setText("30");
			//fahrenheitRdb.setSelected(true);
			//convertBtn.fire();
			resultLbl.setText("");
		});

		convert60Btn.setOnAction( event -> {
			inputTxf.setText("60");
			//fahrenheitRdb.setSelected(true);
			//convertBtn.fire();
			resultLbl.setText("");
		});

		convertBtn.setOnAction(event->{
			
			// Eingabefeld auslesen und in Datentyp Double wandeln
			double temperatur = Double.parseDouble(inputTxf.getText());		
			double val;
			
			if(celsiusRdb.isSelected()){
				val = (temperatur-32)*5/9;
				resultLbl.setText( formatResult(val, true));
				//resultLbl.setStyle("-fx-background-color: red;");
			}
			else {
				val = temperatur*1.8+32;
				resultLbl.setText( formatResult(val, false));
			}
		});
		


		// III.) Szene (Komponenten) auf die Bühne "primaryStage" stellen
		// **************************************************************		
		

		// Fenstertitel. Das Objekt "primaryStage" bekamen wir vom JavaFX-System
		// oben als Methodenparameter mitgeliefert. Es stellt die Bühne dar, auf der dann das Leben spielt...
		primaryStage.setTitle("Converter");
		
		// Eine neue Szene instanziieren. Diese besteht aus unserem Grid mit
		// den Komponenten drinnen. Die Szene besitzt Abmessungen (=Fenstergröße)
		Scene scene = new Scene(grid, 350, 150);
		
		// Die Szene der Bühne hinzufügen
		primaryStage.setScene(scene);
		
		// ...und letz's start the show (anzeigen).
		// Der Ablauf ist oft gleich:
		// 1. Komponenten erzeugen 2. einer Szene hinzufügen, 3. Szene auf die Bühne Stellen, 4. Show starten
		primaryStage.show();
	}
	

	// Double Wert formatieren auf zwei Nachkommastellen und als String retournieren
	private String formatResult(double d, boolean isCelsius) {
		return new DecimalFormat("##.##").format(d) +  (isCelsius?'C':'F');
	}
	
	
	// *** MAIN
	public static void main(String[] args) {
		// statische Methode in der geerbten Klasse, die dann obiges start(Stage primaryStage) aufrufen wird.
		launch(args);
	}

}


