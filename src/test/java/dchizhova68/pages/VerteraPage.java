package dchizhova68.pages;


import com.codeborne.selenide.SelenideElement;
import dchizhova68.pages.components.CalendarComponent;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.ElementsCollection;

public class VerteraPage {
    private SelenideElement
            catalogLink = $(byTagAndText("a", "Каталог")),
            locationButton = $(".menu__geo--city");

    private ElementsCollection
            newsList = $$(".n-news-list"),
            newsTitleList = $$(".n-news-list__title"),
            headerNavItemList = $(".header__nav").$$("a"),
            mainNavItemList = $(".main-nav").$$("a");

    CalendarComponent calendar = new CalendarComponent();

    @Step("Открываем главную страницу")
    public VerteraPage openPage() {
        open("/");
        return this;
    }

    @Step("Открыть католог")
    public VerteraPage selectLocation() {
        locationButton.click();
        return this;
    }

}
