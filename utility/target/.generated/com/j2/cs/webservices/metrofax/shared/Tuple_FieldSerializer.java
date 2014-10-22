package com.j2.cs.webservices.metrofax.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Tuple_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Object getA(com.j2.cs.webservices.metrofax.shared.Tuple instance) /*-{
    return instance.@com.j2.cs.webservices.metrofax.shared.Tuple::a;
  }-*/;
  
  private static native void setA(com.j2.cs.webservices.metrofax.shared.Tuple instance, java.lang.Object value) 
  /*-{
    instance.@com.j2.cs.webservices.metrofax.shared.Tuple::a = value;
  }-*/;
  
  private static native java.lang.Object getB(com.j2.cs.webservices.metrofax.shared.Tuple instance) /*-{
    return instance.@com.j2.cs.webservices.metrofax.shared.Tuple::b;
  }-*/;
  
  private static native void setB(com.j2.cs.webservices.metrofax.shared.Tuple instance, java.lang.Object value) 
  /*-{
    instance.@com.j2.cs.webservices.metrofax.shared.Tuple::b = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.j2.cs.webservices.metrofax.shared.Tuple instance) throws SerializationException {
    setA(instance, streamReader.readObject());
    setB(instance, streamReader.readObject());
    
  }
  
  public static com.j2.cs.webservices.metrofax.shared.Tuple instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.j2.cs.webservices.metrofax.shared.Tuple();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.j2.cs.webservices.metrofax.shared.Tuple instance) throws SerializationException {
    streamWriter.writeObject(getA(instance));
    streamWriter.writeObject(getB(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.j2.cs.webservices.metrofax.shared.Tuple_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.j2.cs.webservices.metrofax.shared.Tuple_FieldSerializer.deserialize(reader, (com.j2.cs.webservices.metrofax.shared.Tuple)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.j2.cs.webservices.metrofax.shared.Tuple_FieldSerializer.serialize(writer, (com.j2.cs.webservices.metrofax.shared.Tuple)object);
  }
  
}
