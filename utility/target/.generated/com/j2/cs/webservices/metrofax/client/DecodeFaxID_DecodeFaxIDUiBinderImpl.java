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

public class DecodeFaxID_DecodeFaxIDUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.j2.cs.webservices.metrofax.client.DecodeFaxID>, com.j2.cs.webservices.metrofax.client.DecodeFaxID.DecodeFaxIDUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Decode")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.j2.cs.webservices.metrofax.client.DecodeFaxID owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.j2.cs.webservices.metrofax.client.DecodeFaxID owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onEncodeBoxClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.j2.cs.webservices.metrofax.client.DecodeFaxID owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_faxIdField();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_encodeBox();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_button();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_f_Label5();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_serviceKeyLabel();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_f_Label7();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_messageIdField();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_f_Label2();  // more than one getter call detected. Type: DEFAULT, precedence: 3
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
    private com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle) GWT.create(com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenCss_style style;
    private com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.j2.cs.webservices.metrofax.client.DecodeFaxID_DecodeFaxIDUiBinderImpl_GenCss_style build_style() {
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
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord0.detach();
      f_HTMLPanel1.addAndReplaceElement(get_verticalPanel(), get_domId0Element().get());

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
     * Getter for verticalPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_verticalPanel() {
      return build_verticalPanel();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_verticalPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel verticalPanel = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      verticalPanel.add(get_f_Label2());
      verticalPanel.setCellHorizontalAlignment(get_f_Label2(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      verticalPanel.add(get_f_HorizontalPanel3());
      verticalPanel.add(get_f_HorizontalPanel4());
      verticalPanel.add(get_f_HorizontalPanel6());
      verticalPanel.setStyleName("" + get_style().dialogBox() + "");
      verticalPanel.setHeight("137px");
      verticalPanel.setWidth("368px");


      this.owner.verticalPanel = verticalPanel;

      return verticalPanel;
    }

    /**
     * Getter for f_Label2 called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label f_Label2;
    private com.google.gwt.user.client.ui.Label get_f_Label2() {
      return f_Label2;
    }
    private com.google.gwt.user.client.ui.Label build_f_Label2() {
      // Creation section.
      f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label2.setStyleName("" + get_style().faxIdLabel1() + "");
      f_Label2.setText("Fax ID Decoding");
      f_Label2.setWidth("326px");


      return f_Label2;
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
      f_HorizontalPanel3.add(get_faxIdField());
      f_HorizontalPanel3.setCellHorizontalAlignment(get_faxIdField(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel3.add(get_encodeBox());
      f_HorizontalPanel3.setCellHorizontalAlignment(get_encodeBox(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel3.add(get_button());
      f_HorizontalPanel3.setCellHorizontalAlignment(get_button(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel3.setHeight("32px");
      f_HorizontalPanel3.setWidth("355px");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for faxIdField called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.LongBox faxIdField;
    private com.google.gwt.user.client.ui.LongBox get_faxIdField() {
      return faxIdField;
    }
    private com.google.gwt.user.client.ui.LongBox build_faxIdField() {
      // Creation section.
      faxIdField = (com.google.gwt.user.client.ui.LongBox) GWT.create(com.google.gwt.user.client.ui.LongBox.class);
      // Setup section.
      faxIdField.setStyleName("textBoxBorder");
      faxIdField.setText("");


      this.owner.faxIdField = faxIdField;

      return faxIdField;
    }

    /**
     * Getter for encodeBox called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.CheckBox encodeBox;
    private com.google.gwt.user.client.ui.CheckBox get_encodeBox() {
      return encodeBox;
    }
    private com.google.gwt.user.client.ui.CheckBox build_encodeBox() {
      // Creation section.
      encodeBox = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
      // Setup section.
      encodeBox.setText("Encode");
      encodeBox.setWidth("73px");
      encodeBox.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      this.owner.encodeBox = encodeBox;

      return encodeBox;
    }

    /**
     * Getter for button called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button button;
    private com.google.gwt.user.client.ui.Button get_button() {
      return button;
    }
    private com.google.gwt.user.client.ui.Button build_button() {
      // Creation section.
      button = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      button.setHTML(template_html1().asString());
      button.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.button = button;

      return button;
    }

    /**
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.add(get_f_Label5());
      f_HorizontalPanel4.setCellHorizontalAlignment(get_f_Label5(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel4.add(get_serviceKeyLabel());
      f_HorizontalPanel4.setCellHorizontalAlignment(get_serviceKeyLabel(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel4.setHeight("28px");
      f_HorizontalPanel4.setWidth("358px");


      return f_HorizontalPanel4;
    }

    /**
     * Getter for f_Label5 called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label f_Label5;
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return f_Label5;
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setText("ServiceKey:");
      f_Label5.setWidth("249px");


      return f_Label5;
    }

    /**
     * Getter for serviceKeyLabel called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox serviceKeyLabel;
    private com.google.gwt.user.client.ui.TextBox get_serviceKeyLabel() {
      return serviceKeyLabel;
    }
    private com.google.gwt.user.client.ui.TextBox build_serviceKeyLabel() {
      // Creation section.
      serviceKeyLabel = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      serviceKeyLabel.setStyleName("textBoxBorder");
      serviceKeyLabel.setHeight("15px");
      serviceKeyLabel.setWidth("90px");


      this.owner.serviceKeyLabel = serviceKeyLabel;

      return serviceKeyLabel;
    }

    /**
     * Getter for f_HorizontalPanel6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return build_f_HorizontalPanel6();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.add(get_f_Label7());
      f_HorizontalPanel6.setCellHorizontalAlignment(get_f_Label7(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel6.add(get_messageIdField());
      f_HorizontalPanel6.setCellHorizontalAlignment(get_messageIdField(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
      f_HorizontalPanel6.setHeight("28px");
      f_HorizontalPanel6.setWidth("357px");


      return f_HorizontalPanel6;
    }

    /**
     * Getter for f_Label7 called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label f_Label7;
    private com.google.gwt.user.client.ui.Label get_f_Label7() {
      return f_Label7;
    }
    private com.google.gwt.user.client.ui.Label build_f_Label7() {
      // Creation section.
      f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label7.setText("MessageID/Timestamp:");
      f_Label7.setWidth("256px");


      return f_Label7;
    }

    /**
     * Getter for messageIdField called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox messageIdField;
    private com.google.gwt.user.client.ui.TextBox get_messageIdField() {
      return messageIdField;
    }
    private com.google.gwt.user.client.ui.TextBox build_messageIdField() {
      // Creation section.
      messageIdField = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      messageIdField.setStyleName("textBoxBorder");
      messageIdField.setHeight("15px");
      messageIdField.setWidth("90px");


      this.owner.messageIdField = messageIdField;

      return messageIdField;
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
