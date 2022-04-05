package FactoryAbstract;

import FactoryAbstract.antyczne.AntyczneMebleFactory;
import FactoryAbstract.nowoczesne.NowoczesneMebleFactory;

public class Factory {
    public static FabrykaMebli getTypMebli(TypMebli nazwa){
        switch(nazwa){
            case ANTYCZNE:{
                return new AntyczneMebleFactory();
            }
            case NOWOCZESNE:{
                return new NowoczesneMebleFactory();
            }
            default:return null;
        }
    }
}
