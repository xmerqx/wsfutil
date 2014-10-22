package com.j2.cs.webservices.metrofax.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle {
  private static RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenCss_style() {
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
        return (".GIHQHLYDAJ,.GIHQHLYDPI{font-weight:" + ("bold")  + ";}.GIHQHLYDNI{border:" + ("1px"+ " " +"solid"+ " " +"black")  + ";}.GIHQHLYDOI{background-color:" + ("lavender")  + ";}");
      }
      public java.lang.String RetrieveFusemail() {
        return "GIHQHLYDNI";
      }
      public java.lang.String backgroundColor() {
        return "GIHQHLYDOI";
      }
      public java.lang.String fusemailLabel() {
        return "GIHQHLYDPI";
      }
      public java.lang.String important() {
        return "GIHQHLYDAJ";
      }
      public java.lang.String textAreas() {
        return "GIHQHLYDBJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
