/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

/**
 *
 * @author sergioescalante
 */
public class PasswordGenerator 
{
    private String animal;
    private String color;
    private int month;
    private int day;
    private String website;
    //hey it worked!
    public PasswordGenerator(String FavoriteAnimal , String FavoriteColor , int BirthMonth , int BirthDay , String CurrentWebsite)
    {
        animal = FavoriteAnimal;
        color = FavoriteColor;
        month = BirthMonth;
        day = BirthDay;
        website = CurrentWebsite;    
    } 
    
    public String getFirstOption()
    {
        String option1 = color.substring(0, 3).toLowerCase() + animal.substring(0, 3).toLowerCase() + website.substring(0, 3).toUpperCase() + month + day;
        return option1;
    }
    
    public String getSecondOption()
    {
        String option2 = website.substring(0, 3).toUpperCase() + month + day + color.substring(0, 3).toLowerCase() + animal.substring(0, 3).toLowerCase();
        return option2;
    }
}
