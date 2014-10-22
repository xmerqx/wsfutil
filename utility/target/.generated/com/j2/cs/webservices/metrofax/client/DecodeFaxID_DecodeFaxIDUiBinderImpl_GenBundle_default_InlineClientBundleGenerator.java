package com.j2.cs.webservices.metrofax.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle {
  private static DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GIHQHLYDHI{color:" + ("orangered")  + ";font-weight:" + ("bold")  + ";}.GIHQHLYDFI{border:" + ("1px"+ " " +"solid"+ " " +"Black")  + ";}.GIHQHLYDGI{font-weight:" + ("bold")  + ";}.GIHQHLYDEI{background-color:" + ("lavender")  + ";}.GIHQHLYDII{border:" + ("1px"+ " " +"solid"+ " " +"darkgray")  + ";}");
      }
      public java.lang.String backgroundColor() {
        return "GIHQHLYDEI";
      }
      public java.lang.String dialogBox() {
        return "GIHQHLYDFI";
      }
      public java.lang.String faxIdLabel1() {
        return "GIHQHLYDGI";
      }
      public java.lang.String important() {
        return "GIHQHLYDHI";
      }
      public java.lang.String textBoxBorder() {
        return "GIHQHLYDII";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
