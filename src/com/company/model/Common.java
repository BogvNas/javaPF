package com.company.model;

import com.company.saveload.SaveData;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
abstract public class Common {

     public Common() {
     }

     public String getValueForComboBox(){
          return null;
     }

     public void postAdd(SaveData sd){}
     public void postEdit(SaveData sd){}
     public void postRemove(SaveData sd){}
}
