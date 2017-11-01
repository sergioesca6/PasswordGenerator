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
    
    public PasswordGenerator(String FavoriteAnimal , String FavoriteColor , int BirthMonth , int BirthDay , String CurrentWebsite)
    {
        animal = FavoriteAnimal;
        color = FavoriteColor;
        month = BirthMonth;
        day = BirthDay;
        website = CurrentWebsite;    
    }
    
    //gets the first three letters of the string animal.
    public String getFirstAnimal()
    {
        String first3Animal = animal.substring(0, 3);
        return (first3Animal);
    }
    
    public String getFirstColor()
    {
        String first3Color = color.substring(0, 3);
        return (first3Color);
    }
    
    public String getFirstWebsite()
    {
        String first3Website = website.substring(0, 3);
        return (first3Website.toUpperCase());
    }
}
