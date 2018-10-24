/**
 * Danta API Bundle
 * (danta.api)
 *
 * Copyright (C) 2017 Tikal Technologies, Inc. All rights reserved.
 *
 * Licensed under GNU Affero General Public License, Version v3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.gnu.org/licenses/agpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied;
 * without even the implied warranty of MERCHANTABILITY.
 * See the License for more details.
 */

package danta;

import static javax.jcr.NamespaceRegistry.PREFIX_JCR;
import static javax.jcr.NamespaceRegistry.PREFIX_MIX;
import static javax.jcr.NamespaceRegistry.PREFIX_NT;
import static org.apache.jackrabbit.spi.Name.*;

/**
 * Constants
 *
 * @author      joshuaoransky
 * @version     1.0.0
 * @since       2016-04-20
 */
public class Constants {

	/*
     * _PN	    Resource Property Name
	 * _RT	    Resource Type
	 * _NN	    JCR Node Name
	 * _NT	    Node Type
	 * _EN   	Element Name
	 * _AN	    Attribute Name
	 * _DN	    Directive Name
	 * _CSSN	CSS Class Name
	 * _AV  	Attribute Value
	 * _CP      Config Prop
	 * RE_      RegExp
	 * NS_      Namespace
	 */

    //contexts
    public static final String GLOBAL_PROPERTIES_KEY = "global";
    public static final String DESIGN_PROPERTIES_KEY = "design";
    public static final String COMPONENT_PROPERTIES_KEY = "component";
    public static final String STYLING_PROPERTIES_KEY = "styling";
    public static final String CONFIG_PROPERTIES_KEY = "config";
    public static final String PAGE_PROPERTIES_KEY = "page";
    public static final String LIST_PROPERTIES_KEY = "list";
    public static final String CONTENT = "content";
    //base categories
    public static final String PAGE_CATEGORY = "page";
    public static final String HTML_PAGE_CATEGORY = "htmlpage";
    public static final String GLOBAL_CATEGORY = "global";
    public static final String DESIGN_CATEGORY = "design";
    public static final String COMPONENT_CATEGORY = "component";
    public static final String STYLING_CATEGORY = "styling";
    public static final String CONTENT_CATEGORY = "content";
    //image categories
    public static final String IMAGE_CATEGORY = "image";
    public static final String CONTENT_IMAGE_CATEGORY = "contentImage";
    public static final String DESIGN_IMAGE_CATEGORY = "designImage";
    public static final String GLOBAL_IMAGE_CATEGORY = "globalImage";
    public static final String MULTIPLE_IMAGE_CATEGORY = "multipleImage";
    public static final String MULTIPLE_IMAGE_RESOURCES_CATEGORY = "multipleImageResources";
    public static final String IMAGES_BY_KEY_CATEGORY = "imagesByKey";
    //list categories
    public static final String LIST_CATEGORY = "list";
    public static final String CURATED_LIST_CATEGORY = "curatedList";
    public static final String TRAVERSED_LIST_CATEGORY = "traversedList";
    public static final String ITEM_LIST_CATEGORY = "itemList";
    public static final String PAGE_DETAILS_CATEGORY = "pageDetails";
    //priorities
    public static final int HIGHEST_PRIORITY = 1000;
    public static final int HIGHER_PRIORITY = HIGHEST_PRIORITY - 100;
    public static final int HIGH_PRIORITY = HIGHER_PRIORITY - 100;
    public static final int MEDIUM_PRIORITY = 500;
    public static final int LOW_PRIORITY = 0;
    //config
    public static final String XK_CONFIG_RESOURCE_NAME = "xk.config";
    //page properties
    public static final String PATH = "path";
    public static final String LINK = "link";
    public static final String PAGE_NAME = "pageName";
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    public static final String PAGE_TITLE = "pageTitle";
    public static final String HIDE_IN_NAV = "hideInNav";
    public static final String KEYWORDS = "keywords";
    public static final String TAGS = "tags";
    public static final String TAGS_LIST = "tagsList";
    public static final String TEMPLATE = "template";
    public static final String NAVIGATION_TITLE = "navigationTitle";
    public static final String SUBTITLE = "subtitle";
    public static final String BODY_CLASSES = "bodyClasses";
    public static final String WCM_MODE = "wcmMode";
    public static final String IS_EDIT_MODE = "isEditMode";
    public static final String IS_DESIGN_MODE = "isDesignMode";
    public static final String IS_EDIT_OR_DESIGN_MODE = "isEditOrDesignMode";
    public static final String IS_TOUCH_UI_MODE = "isTouchUIMode";
    public static final String IS_CLASSIC_UI_MODE = "isClassicUIMode";
    public static final String VANITY_PATH = "vanityPath";
    public static final String FAVICON = "favicon";
    public static final String CREATED = "created";
    // general
    public static final String BLANK = "";
    public static final String DOT = ".";
    public static final String SPACE = " ";
    public static final String SLASH = "/";
    public static final String DASH = "-";
    public static final String SELF_LOCAL = "./";
    public static final String PARENT_LOCAL = "../";
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String NAME = "name";
    public static final String DATA = "data";
    public static final String PAGE = "page";
    public static final String COMPONENT = "component";
    public static final String SECTION = "section";
    public static final String NAME_AN = NAME;
    public static final String CLASS = "class";
    public static final String CLASS_AN = CLASS;
    public static final String ID = "id";
    public static final String ID_AN = ID;
    //templating Stuff
    public static final String TEMPLATE_CONTENT_MODEL_ATTR_NAME = "template__danta__contentmodel";
    public static final String ENGINE_RESOURCE = "engine_resource";
    public static final String NS_XUMAK_PN = "xk_";
    public static final String RESOURCE_CONTENT_KEY = CONTENT;
    public static final String STATS = "statistics";
    public static final String STATISTICS_KEY = STATS;
    public static final String PROCESSORS = "processors";
    public static final String PROCESSORS_KEY = STATISTICS_KEY + "." + PROCESSORS;
    //Extension
    public static final String PNG = "png";
    public static final String PNG_EXT = '.' + PNG;
    public static final String IMG = "img";
    public static final String IMG_EXT = '.' + IMG;
    public static final String JPG = "jpg";
    public static final String JPG_EXT = '.' + JPG;
    public static final String JPEG = "jpeg";
    public static final String HTML = "html";
    public static final String HTML_EXT = '.' + HTML;
    public static final String ICO = "ico";
    public static final String ICO_EXT = '.' + ICO;
    public static final String GIF = "gif";
    public static final String IMAGE = "image";
    public static final String OPTIONS = "options";
    //Mimetypes
    public static final String PNG_MIME_TYPE = IMAGE + '/' + PNG;
    public static final String JPG_MIME_TYPE = IMAGE + '/' + JPEG;
    public static final String GIF_MIME_TYPE = IMAGE + SLASH + GIF;
    public static final String TEXT = "text";
    public static final String HTML_MIME_TYPE = TEXT + '/' + HTML;
    public static final String XML = "xml";
    public static final String JSON = "json";
    public static final String JSON_EXT = '.' + JSON;
    public static final String APPLICATION = "application";
    public static final String XML_MIME_TYPE = APPLICATION + '/' + XML;
    public static final String JSON_MIME_TYPE = APPLICATION + '/' + JSON;
    public static final String ROOT = "root";
    public static final String RULES = "rules";
    //Handlebars
    public static final String START_DELIM = "{%";
    public static final String END_DELIM = "%}";
    //Image property names
    public static final String IMAGE_PATH = "imagePath";
    public static final String IMAGE_PATHS = "imagePaths";
    public static final String IMAGE_PATHS_FROM_RESOURCES = "imagePathsFromResources";
    public static final String FILE_REFERENCE = "fileReference";
    public static final String FILE_REFERENCES = "fileReferences";
    //List pages property names
    public static final String PATHREF_CONTENT_KEY_NAME = "pathRef";
    public static final String PATHREFS_CONTENT_KEY_NAME = "pathRefs";
    public static final String PAGEREFS_CONTENT_KEY_NAME = "pageRefs";
    public static final String DEPTH_CONTENT_KEY_NAME  = "depth";
    public static final String PATHREF_LIST_CONTENT_KEY = CONTENT + "." + PATHREF_CONTENT_KEY_NAME;
    public static final String DEPTH_LIST_CONTENT_KEY = CONTENT + "." + DEPTH_CONTENT_KEY_NAME;
    public static final String PATHREFS_LIST_CONTENT_KEY = CONTENT + DOT + PATHREFS_CONTENT_KEY_NAME;
    public static final String LIST_CLASSES_PROP = "listClasses";
    public static final String LIST_ITEM_CLASSES_PROP = "itemClasses";
    public static final int LIST_DEFAULT_DEPTH = 1;
    public static final String PAGE_DETAILS_LIST_CONTEXT_PROPERTY_NAME = LIST_PROPERTIES_KEY + DOT + "pages";
    public static final String PATH_DETAILS_LIST_PATH_PROPERTY_NAME = "path";
    public static final String PATH_LIST_CONTEXT_PROPERTY_NAME = LIST_PROPERTIES_KEY + DOT + "paths";
    public static final String PATH_DETAILS_LIST_PATHS_PROPERTY_NAME = "paths";
    public static final String PAGE_LIST_CONTEXT_PROPERTY_NAME = "pages";
    public static final String REMOVE_CURRENT_PAGE_PATH_CONFIG_KEY = CONFIG_PROPERTIES_KEY + DOT + "xk_removeCurrentPagePath";
    public static final String EXTRA_LIST_PROPERTIES_CONFIG_KEY = "xk_extraListPropertyNames";
    public static final String PATHREF_CONFIGURATION_PROPERTY_NAME = "xk_pathRefKeyName";
    public static final String DEPTH_CONFIGURATION_PROPERTY_NAME = "xk_depthKeyName";
    public static final String LIST_CLASSES_CONFIG_PROP = "xk_listClasses";
    public static final String LIST_ITEM_CLASSES_CONFIG_PROP = "xk_itemClasses";
    public static final String IS_CURRENT_PAGE = "isCurrentPage";
    //List items property names
    public static final String ITEMS_KEY_NAME = "items";
    public static final String ITEMS_CONFIG_KEY = "xk_itemsKeyName";
    public static final String ITEM_LIST_KEY_NAME = LIST_PROPERTIES_KEY + DOT + ITEMS_KEY_NAME;
    // HTTP STUFF
    public static final String GET = "get";
    public static final String HTTP_GET = GET.toUpperCase();
    // HTML Tag Attributes
    public static final String NS_XUMAK_AN = "data-xk-"; // Namespace for XK-Reserved HTML Tag Attributes
    public static final String XK_PATH_AN = NS_XUMAK_AN + PATH; //data-xk-path
    public static final String XK_COMPONENT_CSSN_DN = NS_XUMAK_AN + COMPONENT; //data-xk-component
    public static final String XK_PAGE_CSSN_DN = NS_XUMAK_AN + PAGE; //data-xk-page
    public static final String XK_SECTION_CSSN_DN = NS_XUMAK_AN + SECTION; //data-xk-section
    public static final String XK_CLIENT_ENABLED_DN = NS_XUMAK_AN + "client-enabled"; //data-xk-client-enabled
    // XML & HTML DOM Stuff
    public static final String CDATA = "CDATA";
    public static final String HREF_AN = "href";
    public static final String STYLE_AN = "style";
    public static final String ERROR = "ERROR";
    //Webservice Stuff
    public static final String PRIVATE_AN_PREFIX = "___!_";
    public static final String PAGE_COMPONENT_RESOURCE_LIST_AN = "componentsList";
    public static final String CLIENT_CONTENT_MODEL_SELECTOR = "contentmodel";
    //Reserved system names
    public static final String CQ = "cq";
    public static final String NS_CQ = makeNS(CQ);
    public static final String VLT = "vlt";
    public static final String NS_VLT = makeNS(VLT);
    public static final String SLING_NAMESPACE_PREFIX = "sling";
    public static final String makeNS(String prefix) {
        return prefix + ":";
    }
    public static final String[] RESERVED_SYSTEM_NAME_PREFIXES = new String[]{
            makeNS(PREFIX_JCR),
            makeNS(PREFIX_NT),
            makeNS(SLING_NAMESPACE_PREFIX),
            NS_CQ,
            makeNS(NS_REP_PREFIX),
            makeNS(PREFIX_MIX),
            makeNS(NS_SV_PREFIX),
            makeNS(NS_XML_PREFIX),
            makeNS(NS_XMLNS_PREFIX),
            NS_VLT};
}