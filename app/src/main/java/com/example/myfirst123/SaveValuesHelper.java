package com.example.myfirst123;

import android.content.SharedPreferences;

public class SaveValuesHelper
{
    public static final String KEY_FIRST_OPERAND="first_operand";
    public static final String KEY_SECOND_OPERAND="second_operand";
    public static final String KEY_RESULT="result";
    private final SharedPreferences sharedPreferences;

    public SaveValuesHelper(SharedPreferences sharedPreferences)
    {
        this.sharedPreferences = sharedPreferences;
    }
    public void saveValues(Values values)
    {
        sharedPreferences.edit().
                putString(KEY_FIRST_OPERAND,values.getFirstOperation()).
                putString(KEY_SECOND_OPERAND,values.getSecondOperation()).
                putString(KEY_RESULT,values.getResult()).
                commit();
    }
    public Values readValues()
    {
        Values values=new Values();
        values.setFirstOperation(sharedPreferences.getString(KEY_FIRST_OPERAND,""));
        values.setSecondOperation(sharedPreferences.getString(KEY_SECOND_OPERAND,""));
        values.setResult(sharedPreferences.getString(KEY_RESULT,""));
        return values;
    }

}
