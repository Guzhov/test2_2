package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Favorites {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public Favorites(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора вкладки авто
     */
    @FindBy(xpath = "//a[text()='Автомобили']")
    private WebElement cars;

    /**
     * определение локатора для добавления автомобиля в избранное
     */
    @FindBy(css = "[class='css-sdfa5i']")
    private WebElement userFavorites;

    /**
     * метод для нажатия кнопки меню пользователя
     */

    public void addFavorites() {
        userFavorites.click(); }

    /**
     * метод перехода на вкладку с автомобилями
     */

    public void entryCars() {
        cars.click(); }
}
