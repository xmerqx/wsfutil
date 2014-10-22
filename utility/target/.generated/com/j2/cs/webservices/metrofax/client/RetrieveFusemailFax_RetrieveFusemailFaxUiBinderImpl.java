package com.j2.cs.webservices.metrofax.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax>, com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax.RetrieveFusemailFaxUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Retrieve")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onRetrieveButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_f_Label4();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_serviceKeyField();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_didField();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_faxIdField();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_inboundRadio();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_outboundRadio();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_resultText();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_retrieveButton();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_f_HorizontalPanel5();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_f_HorizontalPanel6();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_f_HorizontalPanel7();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle) GWT.create(com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenCss_style style;
    private com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.j2.cs.webservices.metrofax.client.RetrieveFusemailFax_RetrieveFusemailFaxUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      f_HTMLPanel1.setStyleName("" + get_style().backgroundColor() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord2 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord2.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_VerticalPanel2(), get_domId0Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.add(get_f_HorizontalPanel3());
      f_VerticalPanel2.add(get_f_HorizontalPanel5());
      f_VerticalPanel2.setCellHorizontalAlignment(get_f_HorizontalPanel5(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_VerticalPanel2.add(get_f_HorizontalPanel6());
      f_VerticalPanel2.setCellHorizontalAlignment(get_f_HorizontalPanel6(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_VerticalPanel2.add(get_f_HorizontalPanel7());
      f_VerticalPanel2.setCellHorizontalAlignment(get_f_HorizontalPanel7(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_VerticalPanel2.add(get_f_HorizontalPanel8());
      f_VerticalPanel2.setStyleName("" + get_style().RetrieveFusemail() + "");
      f_VerticalPanel2.setHeight("307px");
      f_VerticalPanel2.setWidth("750px");


      return f_VerticalPanel2;
    }

    /**
     * Getter for f_HorizontalPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel3() {
      return build_f_HorizontalPanel3();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel3.add(get_f_Label4());
      f_HorizontalPanel3.setCellHorizontalAlignment(get_f_Label4(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel3.setHeight("31px");
      f_HorizontalPanel3.setWidth("748px");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for f_Label4 called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label f_Label4;
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return f_Label4;
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setStyleName("" + get_style().fusemailLabel() + "");
      f_Label4.setText("Retrieve Fusemail Message");


      return f_Label4;
    }

    /**
     * Getter for f_HorizontalPanel5 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5;
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel5() {
      return f_HorizontalPanel5;
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel5() {
      // Creation section.
      f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel5.add(get_serviceKeyField());
      f_HorizontalPanel5.setCellHorizontalAlignment(get_serviceKeyField(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel5.add(get_didField());
      f_HorizontalPanel5.setCellHorizontalAlignment(get_didField(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel5.setHeight("31px");
      f_HorizontalPanel5.setWidth("409px");


      return f_HorizontalPanel5;
    }

    /**
     * Getter for serviceKeyField called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox serviceKeyField;
    private com.google.gwt.user.client.ui.TextBox get_serviceKeyField() {
      return serviceKeyField;
    }
    private com.google.gwt.user.client.ui.TextBox build_serviceKeyField() {
      // Creation section.
      serviceKeyField = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      serviceKeyField.setStyleName("textBoxBorder");


      this.owner.serviceKeyField = serviceKeyField;

      return serviceKeyField;
    }

    /**
     * Getter for didField called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox didField;
    private com.google.gwt.user.client.ui.TextBox get_didField() {
      return didField;
    }
    private com.google.gwt.user.client.ui.TextBox build_didField() {
      // Creation section.
      didField = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      didField.setStyleName("textBoxBorder");


      this.owner.didField = didField;

      return didField;
    }

    /**
     * Getter for f_HorizontalPanel6 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6;
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return f_HorizontalPanel6;
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.add(get_faxIdField());
      f_HorizontalPanel6.setCellHorizontalAlignment(get_faxIdField(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel6.add(get_inboundRadio());
      f_HorizontalPanel6.setCellHorizontalAlignment(get_inboundRadio(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel6.add(get_outboundRadio());
      f_HorizontalPanel6.setCellHorizontalAlignment(get_outboundRadio(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel6.setHeight("31px");
      f_HorizontalPanel6.setWidth("405px");


      return f_HorizontalPanel6;
    }

    /**
     * Getter for faxIdField called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox faxIdField;
    private com.google.gwt.user.client.ui.TextBox get_faxIdField() {
      return faxIdField;
    }
    private com.google.gwt.user.client.ui.TextBox build_faxIdField() {
      // Creation section.
      faxIdField = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      faxIdField.setStyleName("textBoxBorder");


      this.owner.faxIdField = faxIdField;

      return faxIdField;
    }

    /**
     * Getter for inboundRadio called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.RadioButton inboundRadio;
    private com.google.gwt.user.client.ui.RadioButton get_inboundRadio() {
      return inboundRadio;
    }
    private com.google.gwt.user.client.ui.RadioButton build_inboundRadio() {
      // Creation section.
      inboundRadio = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.
      inboundRadio.setText("Inbound");


      this.owner.inboundRadio = inboundRadio;

      return inboundRadio;
    }

    /**
     * Getter for outboundRadio called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.RadioButton outboundRadio;
    private com.google.gwt.user.client.ui.RadioButton get_outboundRadio() {
      return outboundRadio;
    }
    private com.google.gwt.user.client.ui.RadioButton build_outboundRadio() {
      // Creation section.
      outboundRadio = new com.google.gwt.user.client.ui.RadioButton("new name");
      // Setup section.
      outboundRadio.setText("Outbound");


      this.owner.outboundRadio = outboundRadio;

      return outboundRadio;
    }

    /**
     * Getter for f_HorizontalPanel7 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel7;
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel7() {
      return f_HorizontalPanel7;
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel7() {
      // Creation section.
      f_HorizontalPanel7 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel7.add(get_resultText());
      f_HorizontalPanel7.setCellHorizontalAlignment(get_resultText(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel7.setHeight("104px");
      f_HorizontalPanel7.setWidth("745px");


      return f_HorizontalPanel7;
    }

    /**
     * Getter for resultText called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextArea resultText;
    private com.google.gwt.user.client.ui.TextArea get_resultText() {
      return resultText;
    }
    private com.google.gwt.user.client.ui.TextArea build_resultText() {
      // Creation section.
      resultText = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      resultText.setStyleName("textBoxBorder");
      resultText.setHeight("98px");
      resultText.setWidth("673px");


      this.owner.resultText = resultText;

      return resultText;
    }

    /**
     * Getter for f_HorizontalPanel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel8() {
      return build_f_HorizontalPanel8();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel8.add(get_retrieveButton());
      f_HorizontalPanel8.setCellHorizontalAlignment(get_retrieveButton(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel8.setHeight("31px");
      f_HorizontalPanel8.setWidth("745px");


      return f_HorizontalPanel8;
    }

    /**
     * Getter for retrieveButton called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button retrieveButton;
    private com.google.gwt.user.client.ui.Button get_retrieveButton() {
      return retrieveButton;
    }
    private com.google.gwt.user.client.ui.Button build_retrieveButton() {
      // Creation section.
      retrieveButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      retrieveButton.setHTML(template_html1().asString());
      retrieveButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.retrieveButton = retrieveButton;

      return retrieveButton;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }
  }
}
