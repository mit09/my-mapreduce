package neu.mapreduce.api.factory;

import api.MyMapperAPI;

/**
 * Created by mit,srikar,vishal on 4/8/15.
 */


public final class MapFactory<T extends MyMapperAPI>{

    private Class<T> typeArgumentClass;
    private T singletonObject;

    public MapFactory(Class<T> typeArgumentClass) throws IllegalAccessException, InstantiationException {

        this.typeArgumentClass = typeArgumentClass;
        singletonObject = typeArgumentClass.newInstance();
    }

    public T getSingletonObject() {
        return singletonObject;
    }

    public T getNewInstance() throws IllegalAccessException, InstantiationException {
        T myNewT = typeArgumentClass.newInstance();
        return myNewT;
    }
}