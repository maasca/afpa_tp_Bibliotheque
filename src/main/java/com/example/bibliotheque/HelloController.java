package com.example.bibliotheque;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private MenuItem barreAPropos;

    @FXML
    private MenuItem barreAjouter;

    @FXML
    private MenuItem barreEditer;

    @FXML
    private MenuItem barreQuitter;

    @FXML
    private Button boutonFiltrer;

    @FXML
    private TableColumn<?, ?> colonneActeur;

    @FXML
    private TableColumn<?, ?> colonneAuteur;

    @FXML
    private TableColumn<?, ?> colonneDateParution;

    @FXML
    private TableColumn<?, ?> colonneEtat;

    @FXML
    private TableColumn<?, ?> colonneLangues;

    @FXML
    private TableColumn<?, ?> colonneRef;

    @FXML
    private TableColumn<?, ?> colonneSupport;

    @FXML
    private TableColumn<?, ?> colonneTheme;

    @FXML
    private TableColumn<?, ?> colonneTitre;

    @FXML
    private TableColumn<?, ?> colonneType;

    @FXML
    private ComboBox<?> filtreEtat;

    @FXML
    private TextField filtreTitre;

    @FXML
    private ComboBox<?> filtreType;
}
