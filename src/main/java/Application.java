
import com.system.presenter.SortPresenter;
import com.system.services.FileService;
import com.system.services.SortService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author busat
 */
public class Application {

    public static void main(String[] args) {
        FileService fileService = new FileService();
        SortService sortService = new SortService();
        new SortPresenter(fileService, sortService);
    }

}
