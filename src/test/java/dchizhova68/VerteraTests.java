package dchizhova68;

import dchizhova68.pages.VerteraPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class VerteraTests extends TestBase {
    VerteraPage verteraPage = new VerteraPage();
    @Test
    @DisplayName("Проверка открытия правой боковой панели с меню")
    void openRightMenuTest() {
        verteraPage.openPage()
                .selectLocation();
    }
}
