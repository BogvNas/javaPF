package com.company.saveload;

import com.company.settings.Settings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author N.Petrov
 * @link http://N.Petrov.com
 */
public class SaveLoad {

    public static void load(SaveData sd) {

        try {

            JAXBContext context = JAXBContext.newInstance(Wrapper.class);
            Unmarshaller um = context.createUnmarshaller();
            Wrapper wrapper = (Wrapper) um.unmarshal(Settings.getFileSave());

            sd.setAccounts(wrapper.getAccounts());
            sd.setArticles(wrapper.getArticles());
            sd.setCurrencies(wrapper.getCurrencies());
            sd.setTransfers(wrapper.getTransfers());
            sd.setTransactions(wrapper.getTransactions());

        } catch (JAXBException e) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void save(SaveData sd){
        try {
            JAXBContext context = JAXBContext.newInstance(Wrapper.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Wrapper wrapper = new Wrapper();
            wrapper.setAccounts(sd.getAccounts());
            wrapper.setArticles(sd.getArticles());
            wrapper.setCurrencies(sd.getCurrencies());
            wrapper.setTransfers(sd.getTransfers());
            wrapper.setTransactions(sd.getTransactions());

            m.marshal(wrapper, Settings.getFileSave());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
