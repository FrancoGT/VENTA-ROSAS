package android.support.design;

import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;

public final class R {
    public static volatile transient /* synthetic */ IncrementalChange $change;

    public static final class anim {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_fade_in = 2131034112;
        public static final int abc_fade_out = 2131034113;
        public static final int abc_grow_fade_in_from_bottom = 2131034114;
        public static final int abc_popup_enter = 2131034115;
        public static final int abc_popup_exit = 2131034116;
        public static final int abc_shrink_fade_out_from_bottom = 2131034117;
        public static final int abc_slide_in_bottom = 2131034118;
        public static final int abc_slide_in_top = 2131034119;
        public static final int abc_slide_out_bottom = 2131034120;
        public static final int abc_slide_out_top = 2131034121;
        public static final int design_fab_in = 2131034122;
        public static final int design_fab_out = 2131034123;
        public static final int design_snackbar_in = 2131034124;
        public static final int design_snackbar_out = 2131034125;

        anim(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case -547592901:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$anim"}));
            }
        }

        public static /* synthetic */ Object access$super(anim anim, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$anim"}));
            }
        }

        public anim() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$anim;)V", this);
            }
        }
    }

    public static final class attr {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int actionBarDivider = 2130772133;
        public static final int actionBarItemBackground = 2130772134;
        public static final int actionBarPopupTheme = 2130772127;
        public static final int actionBarSize = 2130772132;
        public static final int actionBarSplitStyle = 2130772129;
        public static final int actionBarStyle = 2130772128;
        public static final int actionBarTabBarStyle = 2130772123;
        public static final int actionBarTabStyle = 2130772122;
        public static final int actionBarTabTextStyle = 2130772124;
        public static final int actionBarTheme = 2130772130;
        public static final int actionBarWidgetTheme = 2130772131;
        public static final int actionButtonStyle = 2130772159;
        public static final int actionDropDownStyle = 2130772155;
        public static final int actionLayout = 2130772049;
        public static final int actionMenuTextAppearance = 2130772135;
        public static final int actionMenuTextColor = 2130772136;
        public static final int actionModeBackground = 2130772139;
        public static final int actionModeCloseButtonStyle = 2130772138;
        public static final int actionModeCloseDrawable = 2130772141;
        public static final int actionModeCopyDrawable = 2130772143;
        public static final int actionModeCutDrawable = 2130772142;
        public static final int actionModeFindDrawable = 2130772147;
        public static final int actionModePasteDrawable = 2130772144;
        public static final int actionModePopupWindowStyle = 2130772149;
        public static final int actionModeSelectAllDrawable = 2130772145;
        public static final int actionModeShareDrawable = 2130772146;
        public static final int actionModeSplitBackground = 2130772140;
        public static final int actionModeStyle = 2130772137;
        public static final int actionModeWebSearchDrawable = 2130772148;
        public static final int actionOverflowButtonStyle = 2130772125;
        public static final int actionOverflowMenuStyle = 2130772126;
        public static final int actionProviderClass = 2130772051;
        public static final int actionViewClass = 2130772050;
        public static final int activityChooserViewStyle = 2130772167;
        public static final int alertDialogButtonGroupStyle = 2130772202;
        public static final int alertDialogCenterButtons = 2130772203;
        public static final int alertDialogStyle = 2130772201;
        public static final int alertDialogTheme = 2130772204;
        public static final int allowStacking = 2130772008;
        public static final int arrowHeadLength = 2130772036;
        public static final int arrowShaftLength = 2130772037;
        public static final int autoCompleteTextViewStyle = 2130772209;
        public static final int background = 2130771980;
        public static final int backgroundSplit = 2130771982;
        public static final int backgroundStacked = 2130771981;
        public static final int backgroundTint = 2130772238;
        public static final int backgroundTintMode = 2130772239;
        public static final int barLength = 2130772038;
        public static final int behavior_overlapTop = 2130772066;
        public static final int borderWidth = 2130772043;
        public static final int borderlessButtonStyle = 2130772164;
        public static final int buttonBarButtonStyle = 2130772161;
        public static final int buttonBarNegativeButtonStyle = 2130772207;
        public static final int buttonBarNeutralButtonStyle = 2130772208;
        public static final int buttonBarPositiveButtonStyle = 2130772206;
        public static final int buttonBarStyle = 2130772160;
        public static final int buttonPanelSideLayout = 2130771999;
        public static final int buttonStyle = 2130772210;
        public static final int buttonStyleSmall = 2130772211;
        public static final int buttonTint = 2130772024;
        public static final int buttonTintMode = 2130772025;
        public static final int checkboxStyle = 2130772212;
        public static final int checkedTextViewStyle = 2130772213;
        public static final int closeIcon = 2130772071;
        public static final int closeItemLayout = 2130771996;
        public static final int collapseContentDescription = 2130772229;
        public static final int collapseIcon = 2130772228;
        public static final int collapsedTitleGravity = 2130772021;
        public static final int collapsedTitleTextAppearance = 2130772017;
        public static final int color = 2130772032;
        public static final int colorAccent = 2130772194;
        public static final int colorButtonNormal = 2130772198;
        public static final int colorControlActivated = 2130772196;
        public static final int colorControlHighlight = 2130772197;
        public static final int colorControlNormal = 2130772195;
        public static final int colorPrimary = 2130772192;
        public static final int colorPrimaryDark = 2130772193;
        public static final int colorSwitchThumbNormal = 2130772199;
        public static final int commitIcon = 2130772076;
        public static final int contentInsetEnd = 2130771991;
        public static final int contentInsetLeft = 2130771992;
        public static final int contentInsetRight = 2130771993;
        public static final int contentInsetStart = 2130771990;
        public static final int contentScrim = 2130772018;
        public static final int controlBackground = 2130772200;
        public static final int counterEnabled = 2130772107;
        public static final int counterMaxLength = 2130772108;
        public static final int counterOverflowTextAppearance = 2130772110;
        public static final int counterTextAppearance = 2130772109;
        public static final int customNavigationLayout = 2130771983;
        public static final int defaultQueryHint = 2130772070;
        public static final int dialogPreferredPadding = 2130772153;
        public static final int dialogTheme = 2130772152;
        public static final int displayOptions = 2130771973;
        public static final int divider = 2130771979;
        public static final int dividerHorizontal = 2130772166;
        public static final int dividerPadding = 2130772047;
        public static final int dividerVertical = 2130772165;
        public static final int drawableSize = 2130772034;
        public static final int drawerArrowStyle = 2130771968;
        public static final int dropDownListViewStyle = 2130772184;
        public static final int dropdownListPreferredItemHeight = 2130772156;
        public static final int editTextBackground = 2130772173;
        public static final int editTextColor = 2130772172;
        public static final int editTextStyle = 2130772214;
        public static final int elevation = 2130771994;
        public static final int errorEnabled = 2130772105;
        public static final int errorTextAppearance = 2130772106;
        public static final int expandActivityOverflowButtonDrawable = 2130771998;
        public static final int expanded = 2130772004;
        public static final int expandedTitleGravity = 2130772022;
        public static final int expandedTitleMargin = 2130772011;
        public static final int expandedTitleMarginBottom = 2130772015;
        public static final int expandedTitleMarginEnd = 2130772014;
        public static final int expandedTitleMarginStart = 2130772012;
        public static final int expandedTitleMarginTop = 2130772013;
        public static final int expandedTitleTextAppearance = 2130772016;
        public static final int fabSize = 2130772041;
        public static final int foregroundInsidePadding = 2130772044;
        public static final int gapBetweenBars = 2130772035;
        public static final int goIcon = 2130772072;
        public static final int headerLayout = 2130772058;
        public static final int height = 2130771969;
        public static final int hideOnContentScroll = 2130771989;
        public static final int hintAnimationEnabled = 2130772111;
        public static final int hintTextAppearance = 2130772104;
        public static final int homeAsUpIndicator = 2130772158;
        public static final int homeLayout = 2130771984;
        public static final int icon = 2130771977;
        public static final int iconifiedByDefault = 2130772068;
        public static final int imageButtonStyle = 2130772174;
        public static final int indeterminateProgressStyle = 2130771986;
        public static final int initialActivityCount = 2130771997;
        public static final int insetForeground = 2130772065;
        public static final int isLightTheme = 2130771970;
        public static final int itemBackground = 2130772056;
        public static final int itemIconTint = 2130772054;
        public static final int itemPadding = 2130771988;
        public static final int itemTextAppearance = 2130772057;
        public static final int itemTextColor = 2130772055;
        public static final int keylines = 2130772026;
        public static final int layout = 2130772067;
        public static final int layoutManager = 2130772061;
        public static final int layout_anchor = 2130772029;
        public static final int layout_anchorGravity = 2130772031;
        public static final int layout_behavior = 2130772028;
        public static final int layout_collapseMode = 2130772009;
        public static final int layout_collapseParallaxMultiplier = 2130772010;
        public static final int layout_keyline = 2130772030;
        public static final int layout_scrollFlags = 2130772005;
        public static final int layout_scrollInterpolator = 2130772006;
        public static final int listChoiceBackgroundIndicator = 2130772191;
        public static final int listDividerAlertDialog = 2130772154;
        public static final int listItemLayout = 2130772003;
        public static final int listLayout = 2130772000;
        public static final int listPopupWindowStyle = 2130772185;
        public static final int listPreferredItemHeight = 2130772179;
        public static final int listPreferredItemHeightLarge = 2130772181;
        public static final int listPreferredItemHeightSmall = 2130772180;
        public static final int listPreferredItemPaddingLeft = 2130772182;
        public static final int listPreferredItemPaddingRight = 2130772183;
        public static final int logo = 2130771978;
        public static final int logoDescription = 2130772232;
        public static final int maxActionInlineWidth = 2130772080;
        public static final int maxButtonHeight = 2130772227;
        public static final int measureWithLargestChild = 2130772045;
        public static final int menu = 2130772053;
        public static final int multiChoiceItemLayout = 2130772001;
        public static final int navigationContentDescription = 2130772231;
        public static final int navigationIcon = 2130772230;
        public static final int navigationMode = 2130771972;
        public static final int overlapAnchor = 2130772059;
        public static final int paddingEnd = 2130772236;
        public static final int paddingStart = 2130772235;
        public static final int panelBackground = 2130772188;
        public static final int panelMenuListTheme = 2130772190;
        public static final int panelMenuListWidth = 2130772189;
        public static final int popupMenuStyle = 2130772170;
        public static final int popupTheme = 2130771995;
        public static final int popupWindowStyle = 2130772171;
        public static final int preserveIconSpacing = 2130772052;
        public static final int pressedTranslationZ = 2130772042;
        public static final int progressBarPadding = 2130771987;
        public static final int progressBarStyle = 2130771985;
        public static final int queryBackground = 2130772078;
        public static final int queryHint = 2130772069;
        public static final int radioButtonStyle = 2130772215;
        public static final int ratingBarStyle = 2130772216;
        public static final int reverseLayout = 2130772063;
        public static final int rippleColor = 2130772040;
        public static final int searchHintIcon = 2130772074;
        public static final int searchIcon = 2130772073;
        public static final int searchViewStyle = 2130772178;
        public static final int seekBarStyle = 2130772217;
        public static final int selectableItemBackground = 2130772162;
        public static final int selectableItemBackgroundBorderless = 2130772163;
        public static final int showAsAction = 2130772048;
        public static final int showDividers = 2130772046;
        public static final int showText = 2130772087;
        public static final int singleChoiceItemLayout = 2130772002;
        public static final int spanCount = 2130772062;
        public static final int spinBars = 2130772033;
        public static final int spinnerDropDownItemStyle = 2130772157;
        public static final int spinnerStyle = 2130772218;
        public static final int splitTrack = 2130772086;
        public static final int stackFromEnd = 2130772064;
        public static final int state_above_anchor = 2130772060;
        public static final int statusBarBackground = 2130772027;
        public static final int statusBarScrim = 2130772019;
        public static final int submitBackground = 2130772079;
        public static final int subtitle = 2130771974;
        public static final int subtitleTextAppearance = 2130772221;
        public static final int subtitleTextColor = 2130772234;
        public static final int subtitleTextStyle = 2130771976;
        public static final int suggestionRowLayout = 2130772077;
        public static final int switchMinWidth = 2130772084;
        public static final int switchPadding = 2130772085;
        public static final int switchStyle = 2130772219;
        public static final int switchTextAppearance = 2130772083;
        public static final int tabBackground = 2130772091;
        public static final int tabContentStart = 2130772090;
        public static final int tabGravity = 2130772093;
        public static final int tabIndicatorColor = 2130772088;
        public static final int tabIndicatorHeight = 2130772089;
        public static final int tabMaxWidth = 2130772095;
        public static final int tabMinWidth = 2130772094;
        public static final int tabMode = 2130772092;
        public static final int tabPadding = 2130772103;
        public static final int tabPaddingBottom = 2130772102;
        public static final int tabPaddingEnd = 2130772101;
        public static final int tabPaddingStart = 2130772099;
        public static final int tabPaddingTop = 2130772100;
        public static final int tabSelectedTextColor = 2130772098;
        public static final int tabTextAppearance = 2130772096;
        public static final int tabTextColor = 2130772097;
        public static final int textAllCaps = 2130772007;
        public static final int textAppearanceLargePopupMenu = 2130772150;
        public static final int textAppearanceListItem = 2130772186;
        public static final int textAppearanceListItemSmall = 2130772187;
        public static final int textAppearanceSearchResultSubtitle = 2130772176;
        public static final int textAppearanceSearchResultTitle = 2130772175;
        public static final int textAppearanceSmallPopupMenu = 2130772151;
        public static final int textColorAlertDialogListItem = 2130772205;
        public static final int textColorSearchUrl = 2130772177;
        public static final int theme = 2130772237;
        public static final int thickness = 2130772039;
        public static final int thumbTextPadding = 2130772082;
        public static final int title = 2130771971;
        public static final int titleEnabled = 2130772023;
        public static final int titleMarginBottom = 2130772226;
        public static final int titleMarginEnd = 2130772224;
        public static final int titleMarginStart = 2130772223;
        public static final int titleMarginTop = 2130772225;
        public static final int titleMargins = 2130772222;
        public static final int titleTextAppearance = 2130772220;
        public static final int titleTextColor = 2130772233;
        public static final int titleTextStyle = 2130771975;
        public static final int toolbarId = 2130772020;
        public static final int toolbarNavigationButtonStyle = 2130772169;
        public static final int toolbarStyle = 2130772168;
        public static final int track = 2130772081;
        public static final int voiceIcon = 2130772075;
        public static final int windowActionBar = 2130772112;
        public static final int windowActionBarOverlay = 2130772114;
        public static final int windowActionModeOverlay = 2130772115;
        public static final int windowFixedHeightMajor = 2130772119;
        public static final int windowFixedHeightMinor = 2130772117;
        public static final int windowFixedWidthMajor = 2130772116;
        public static final int windowFixedWidthMinor = 2130772118;
        public static final int windowMinWidthMajor = 2130772120;
        public static final int windowMinWidthMinor = 2130772121;
        public static final int windowNoTitle = 2130772113;

        attr(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case 802000155:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$attr"}));
            }
        }

        public static /* synthetic */ Object access$super(attr attr, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$attr"}));
            }
        }

        public attr() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$attr;)V", this);
            }
        }
    }

    public static final class bool {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_action_bar_embed_tabs = 2131165187;
        public static final int abc_action_bar_embed_tabs_pre_jb = 2131165185;
        public static final int abc_action_bar_expanded_action_views_exclusive = 2131165188;
        public static final int abc_allow_stacked_button_bar = 2131165184;
        public static final int abc_config_actionMenuItemAllCaps = 2131165189;
        public static final int abc_config_allowActionMenuItemTextWithIcon = 2131165186;
        public static final int abc_config_closeDialogWhenTouchOutside = 2131165190;
        public static final int abc_config_showMenuShortcutsWhenKeyboardPresent = 2131165191;

        bool(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -2041394796:
                    this();
                    return;
                case -1968665286:
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$bool"}));
            }
        }

        public static /* synthetic */ Object access$super(bool bool, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$bool"}));
            }
        }

        public bool() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$bool;)V", this);
            }
        }
    }

    public static final class color {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_background_cache_hint_selector_material_dark = 2131427398;
        public static final int abc_background_cache_hint_selector_material_light = 2131427399;
        public static final int abc_color_highlight_material = 2131427400;
        public static final int abc_input_method_navigation_guard = 2131427328;
        public static final int abc_primary_text_disable_only_material_dark = 2131427401;
        public static final int abc_primary_text_disable_only_material_light = 2131427402;
        public static final int abc_primary_text_material_dark = 2131427403;
        public static final int abc_primary_text_material_light = 2131427404;
        public static final int abc_search_url_text = 2131427405;
        public static final int abc_search_url_text_normal = 2131427329;
        public static final int abc_search_url_text_pressed = 2131427330;
        public static final int abc_search_url_text_selected = 2131427331;
        public static final int abc_secondary_text_material_dark = 2131427406;
        public static final int abc_secondary_text_material_light = 2131427407;
        public static final int accent_material_dark = 2131427332;
        public static final int accent_material_light = 2131427333;
        public static final int background_floating_material_dark = 2131427334;
        public static final int background_floating_material_light = 2131427335;
        public static final int background_material_dark = 2131427336;
        public static final int background_material_light = 2131427337;
        public static final int bright_foreground_disabled_material_dark = 2131427338;
        public static final int bright_foreground_disabled_material_light = 2131427339;
        public static final int bright_foreground_inverse_material_dark = 2131427340;
        public static final int bright_foreground_inverse_material_light = 2131427341;
        public static final int bright_foreground_material_dark = 2131427342;
        public static final int bright_foreground_material_light = 2131427343;
        public static final int button_material_dark = 2131427344;
        public static final int button_material_light = 2131427345;
        public static final int design_fab_shadow_end_color = 2131427349;
        public static final int design_fab_shadow_mid_color = 2131427350;
        public static final int design_fab_shadow_start_color = 2131427351;
        public static final int design_fab_stroke_end_inner_color = 2131427352;
        public static final int design_fab_stroke_end_outer_color = 2131427353;
        public static final int design_fab_stroke_top_inner_color = 2131427354;
        public static final int design_fab_stroke_top_outer_color = 2131427355;
        public static final int design_snackbar_background_color = 2131427356;
        public static final int design_textinput_error_color = 2131427357;
        public static final int dim_foreground_disabled_material_dark = 2131427358;
        public static final int dim_foreground_disabled_material_light = 2131427359;
        public static final int dim_foreground_material_dark = 2131427360;
        public static final int dim_foreground_material_light = 2131427361;
        public static final int foreground_material_dark = 2131427362;
        public static final int foreground_material_light = 2131427363;
        public static final int highlighted_text_material_dark = 2131427364;
        public static final int highlighted_text_material_light = 2131427365;
        public static final int hint_foreground_material_dark = 2131427366;
        public static final int hint_foreground_material_light = 2131427367;
        public static final int material_blue_grey_800 = 2131427368;
        public static final int material_blue_grey_900 = 2131427369;
        public static final int material_blue_grey_950 = 2131427370;
        public static final int material_deep_teal_200 = 2131427371;
        public static final int material_deep_teal_500 = 2131427372;
        public static final int material_grey_100 = 2131427373;
        public static final int material_grey_300 = 2131427374;
        public static final int material_grey_50 = 2131427375;
        public static final int material_grey_600 = 2131427376;
        public static final int material_grey_800 = 2131427377;
        public static final int material_grey_850 = 2131427378;
        public static final int material_grey_900 = 2131427379;
        public static final int primary_dark_material_dark = 2131427380;
        public static final int primary_dark_material_light = 2131427381;
        public static final int primary_material_dark = 2131427382;
        public static final int primary_material_light = 2131427383;
        public static final int primary_text_default_material_dark = 2131427384;
        public static final int primary_text_default_material_light = 2131427385;
        public static final int primary_text_disabled_material_dark = 2131427386;
        public static final int primary_text_disabled_material_light = 2131427387;
        public static final int ripple_material_dark = 2131427388;
        public static final int ripple_material_light = 2131427389;
        public static final int secondary_text_default_material_dark = 2131427390;
        public static final int secondary_text_default_material_light = 2131427391;
        public static final int secondary_text_disabled_material_dark = 2131427392;
        public static final int secondary_text_disabled_material_light = 2131427393;
        public static final int switch_thumb_disabled_material_dark = 2131427394;
        public static final int switch_thumb_disabled_material_light = 2131427395;
        public static final int switch_thumb_material_dark = 2131427408;
        public static final int switch_thumb_material_light = 2131427409;
        public static final int switch_thumb_normal_material_dark = 2131427396;
        public static final int switch_thumb_normal_material_light = 2131427397;

        color(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case 1115135911:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$color"}));
            }
        }

        public static /* synthetic */ Object access$super(color color, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$color"}));
            }
        }

        public color() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$color;)V", this);
            }
        }
    }

    public static final class dimen {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_action_bar_content_inset_material = 2131230733;
        public static final int abc_action_bar_default_height_material = 2131230721;
        public static final int abc_action_bar_default_padding_end_material = 2131230734;
        public static final int abc_action_bar_default_padding_start_material = 2131230735;
        public static final int abc_action_bar_icon_vertical_padding_material = 2131230746;
        public static final int abc_action_bar_overflow_padding_end_material = 2131230747;
        public static final int abc_action_bar_overflow_padding_start_material = 2131230748;
        public static final int abc_action_bar_progress_bar_size = 2131230722;
        public static final int abc_action_bar_stacked_max_height = 2131230749;
        public static final int abc_action_bar_stacked_tab_max_width = 2131230750;
        public static final int abc_action_bar_subtitle_bottom_margin_material = 2131230751;
        public static final int abc_action_bar_subtitle_top_margin_material = 2131230752;
        public static final int abc_action_button_min_height_material = 2131230753;
        public static final int abc_action_button_min_width_material = 2131230754;
        public static final int abc_action_button_min_width_overflow_material = 2131230755;
        public static final int abc_alert_dialog_button_bar_height = 2131230720;
        public static final int abc_button_inset_horizontal_material = 2131230756;
        public static final int abc_button_inset_vertical_material = 2131230757;
        public static final int abc_button_padding_horizontal_material = 2131230758;
        public static final int abc_button_padding_vertical_material = 2131230759;
        public static final int abc_config_prefDialogWidth = 2131230725;
        public static final int abc_control_corner_material = 2131230760;
        public static final int abc_control_inset_material = 2131230761;
        public static final int abc_control_padding_material = 2131230762;
        public static final int abc_dialog_fixed_height_major = 2131230726;
        public static final int abc_dialog_fixed_height_minor = 2131230727;
        public static final int abc_dialog_fixed_width_major = 2131230728;
        public static final int abc_dialog_fixed_width_minor = 2131230729;
        public static final int abc_dialog_list_padding_vertical_material = 2131230763;
        public static final int abc_dialog_min_width_major = 2131230730;
        public static final int abc_dialog_min_width_minor = 2131230731;
        public static final int abc_dialog_padding_material = 2131230764;
        public static final int abc_dialog_padding_top_material = 2131230765;
        public static final int abc_disabled_alpha_material_dark = 2131230766;
        public static final int abc_disabled_alpha_material_light = 2131230767;
        public static final int abc_dropdownitem_icon_width = 2131230768;
        public static final int abc_dropdownitem_text_padding_left = 2131230769;
        public static final int abc_dropdownitem_text_padding_right = 2131230770;
        public static final int abc_edit_text_inset_bottom_material = 2131230771;
        public static final int abc_edit_text_inset_horizontal_material = 2131230772;
        public static final int abc_edit_text_inset_top_material = 2131230773;
        public static final int abc_floating_window_z = 2131230774;
        public static final int abc_list_item_padding_horizontal_material = 2131230775;
        public static final int abc_panel_menu_list_width = 2131230776;
        public static final int abc_search_view_preferred_width = 2131230777;
        public static final int abc_search_view_text_min_width = 2131230732;
        public static final int abc_seekbar_track_background_height_material = 2131230778;
        public static final int abc_seekbar_track_progress_height_material = 2131230779;
        public static final int abc_select_dialog_padding_start_material = 2131230780;
        public static final int abc_switch_padding = 2131230743;
        public static final int abc_text_size_body_1_material = 2131230781;
        public static final int abc_text_size_body_2_material = 2131230782;
        public static final int abc_text_size_button_material = 2131230783;
        public static final int abc_text_size_caption_material = 2131230784;
        public static final int abc_text_size_display_1_material = 2131230785;
        public static final int abc_text_size_display_2_material = 2131230786;
        public static final int abc_text_size_display_3_material = 2131230787;
        public static final int abc_text_size_display_4_material = 2131230788;
        public static final int abc_text_size_headline_material = 2131230789;
        public static final int abc_text_size_large_material = 2131230790;
        public static final int abc_text_size_medium_material = 2131230791;
        public static final int abc_text_size_menu_material = 2131230792;
        public static final int abc_text_size_small_material = 2131230793;
        public static final int abc_text_size_subhead_material = 2131230794;
        public static final int abc_text_size_subtitle_material_toolbar = 2131230723;
        public static final int abc_text_size_title_material = 2131230795;
        public static final int abc_text_size_title_material_toolbar = 2131230724;
        public static final int design_appbar_elevation = 2131230797;
        public static final int design_fab_border_width = 2131230798;
        public static final int design_fab_content_size = 2131230799;
        public static final int design_fab_elevation = 2131230800;
        public static final int design_fab_size_mini = 2131230801;
        public static final int design_fab_size_normal = 2131230802;
        public static final int design_fab_translation_z_pressed = 2131230803;
        public static final int design_navigation_elevation = 2131230804;
        public static final int design_navigation_icon_padding = 2131230805;
        public static final int design_navigation_icon_size = 2131230806;
        public static final int design_navigation_max_width = 2131230807;
        public static final int design_navigation_padding_bottom = 2131230808;
        public static final int design_navigation_padding_top_default = 2131230744;
        public static final int design_navigation_separator_vertical_padding = 2131230809;
        public static final int design_snackbar_action_inline_max_width = 2131230736;
        public static final int design_snackbar_background_corner_radius = 2131230737;
        public static final int design_snackbar_elevation = 2131230810;
        public static final int design_snackbar_extra_spacing_horizontal = 2131230738;
        public static final int design_snackbar_max_width = 2131230739;
        public static final int design_snackbar_min_width = 2131230740;
        public static final int design_snackbar_padding_horizontal = 2131230811;
        public static final int design_snackbar_padding_vertical = 2131230812;
        public static final int design_snackbar_padding_vertical_2lines = 2131230741;
        public static final int design_snackbar_text_size = 2131230813;
        public static final int design_tab_max_width = 2131230814;
        public static final int design_tab_scrollable_min_width = 2131230742;
        public static final int design_tab_text_size = 2131230815;
        public static final int design_tab_text_size_2line = 2131230816;
        public static final int disabled_alpha_material_dark = 2131230817;
        public static final int disabled_alpha_material_light = 2131230818;
        public static final int highlight_alpha_material_colored = 2131230820;
        public static final int highlight_alpha_material_dark = 2131230821;
        public static final int highlight_alpha_material_light = 2131230822;
        public static final int item_touch_helper_max_drag_scroll_per_frame = 2131230823;
        public static final int notification_large_icon_height = 2131230826;
        public static final int notification_large_icon_width = 2131230827;
        public static final int notification_subtext_size = 2131230828;

        dimen(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case -1961727883:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$dimen"}));
            }
        }

        public static /* synthetic */ Object access$super(dimen dimen, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$dimen"}));
            }
        }

        public dimen() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$dimen;)V", this);
            }
        }
    }

    public static final class drawable {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_ab_share_pack_mtrl_alpha = 2130837504;
        public static final int abc_action_bar_item_background_material = 2130837505;
        public static final int abc_btn_borderless_material = 2130837506;
        public static final int abc_btn_check_material = 2130837507;
        public static final int abc_btn_check_to_on_mtrl_000 = 2130837508;
        public static final int abc_btn_check_to_on_mtrl_015 = 2130837509;
        public static final int abc_btn_colored_material = 2130837510;
        public static final int abc_btn_default_mtrl_shape = 2130837511;
        public static final int abc_btn_radio_material = 2130837512;
        public static final int abc_btn_radio_to_on_mtrl_000 = 2130837513;
        public static final int abc_btn_radio_to_on_mtrl_015 = 2130837514;
        public static final int abc_btn_rating_star_off_mtrl_alpha = 2130837515;
        public static final int abc_btn_rating_star_on_mtrl_alpha = 2130837516;
        public static final int abc_btn_switch_to_on_mtrl_00001 = 2130837517;
        public static final int abc_btn_switch_to_on_mtrl_00012 = 2130837518;
        public static final int abc_cab_background_internal_bg = 2130837519;
        public static final int abc_cab_background_top_material = 2130837520;
        public static final int abc_cab_background_top_mtrl_alpha = 2130837521;
        public static final int abc_control_background_material = 2130837522;
        public static final int abc_dialog_material_background_dark = 2130837523;
        public static final int abc_dialog_material_background_light = 2130837524;
        public static final int abc_edit_text_material = 2130837525;
        public static final int abc_ic_ab_back_mtrl_am_alpha = 2130837526;
        public static final int abc_ic_clear_mtrl_alpha = 2130837527;
        public static final int abc_ic_commit_search_api_mtrl_alpha = 2130837528;
        public static final int abc_ic_go_search_api_mtrl_alpha = 2130837529;
        public static final int abc_ic_menu_copy_mtrl_am_alpha = 2130837530;
        public static final int abc_ic_menu_cut_mtrl_alpha = 2130837531;
        public static final int abc_ic_menu_moreoverflow_mtrl_alpha = 2130837532;
        public static final int abc_ic_menu_paste_mtrl_am_alpha = 2130837533;
        public static final int abc_ic_menu_selectall_mtrl_alpha = 2130837534;
        public static final int abc_ic_menu_share_mtrl_alpha = 2130837535;
        public static final int abc_ic_search_api_mtrl_alpha = 2130837536;
        public static final int abc_ic_voice_search_api_mtrl_alpha = 2130837537;
        public static final int abc_item_background_holo_dark = 2130837538;
        public static final int abc_item_background_holo_light = 2130837539;
        public static final int abc_list_divider_mtrl_alpha = 2130837540;
        public static final int abc_list_focused_holo = 2130837541;
        public static final int abc_list_longpressed_holo = 2130837542;
        public static final int abc_list_pressed_holo_dark = 2130837543;
        public static final int abc_list_pressed_holo_light = 2130837544;
        public static final int abc_list_selector_background_transition_holo_dark = 2130837545;
        public static final int abc_list_selector_background_transition_holo_light = 2130837546;
        public static final int abc_list_selector_disabled_holo_dark = 2130837547;
        public static final int abc_list_selector_disabled_holo_light = 2130837548;
        public static final int abc_list_selector_holo_dark = 2130837549;
        public static final int abc_list_selector_holo_light = 2130837550;
        public static final int abc_menu_hardkey_panel_mtrl_mult = 2130837551;
        public static final int abc_popup_background_mtrl_mult = 2130837552;
        public static final int abc_ratingbar_full_material = 2130837553;
        public static final int abc_scrubber_control_off_mtrl_alpha = 2130837554;
        public static final int abc_scrubber_control_to_pressed_mtrl_000 = 2130837555;
        public static final int abc_scrubber_control_to_pressed_mtrl_005 = 2130837556;
        public static final int abc_scrubber_primary_mtrl_alpha = 2130837557;
        public static final int abc_scrubber_track_mtrl_alpha = 2130837558;
        public static final int abc_seekbar_thumb_material = 2130837559;
        public static final int abc_seekbar_track_material = 2130837560;
        public static final int abc_spinner_mtrl_am_alpha = 2130837561;
        public static final int abc_spinner_textfield_background_material = 2130837562;
        public static final int abc_switch_thumb_material = 2130837563;
        public static final int abc_switch_track_mtrl_alpha = 2130837564;
        public static final int abc_tab_indicator_material = 2130837565;
        public static final int abc_tab_indicator_mtrl_alpha = 2130837566;
        public static final int abc_text_cursor_material = 2130837567;
        public static final int abc_textfield_activated_mtrl_alpha = 2130837568;
        public static final int abc_textfield_default_mtrl_alpha = 2130837569;
        public static final int abc_textfield_search_activated_mtrl_alpha = 2130837570;
        public static final int abc_textfield_search_default_mtrl_alpha = 2130837571;
        public static final int abc_textfield_search_material = 2130837572;
        public static final int design_fab_background = 2130837573;
        public static final int design_snackbar_background = 2130837574;
        public static final int notification_template_icon_bg = 2130837578;

        drawable(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case 405588936:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$drawable"}));
            }
        }

        public static /* synthetic */ Object access$super(drawable drawable, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$drawable"}));
            }
        }

        public drawable() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$drawable;)V", this);
            }
        }
    }

    public static final class id {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int action0 = 2131492983;
        public static final int action_bar = 2131492954;
        public static final int action_bar_activity_content = 2131492864;
        public static final int action_bar_container = 2131492953;
        public static final int action_bar_root = 2131492949;
        public static final int action_bar_spinner = 2131492865;
        public static final int action_bar_subtitle = 2131492923;
        public static final int action_bar_title = 2131492922;
        public static final int action_context_bar = 2131492955;
        public static final int action_divider = 2131492987;
        public static final int action_menu_divider = 2131492866;
        public static final int action_menu_presenter = 2131492867;
        public static final int action_mode_bar = 2131492951;
        public static final int action_mode_bar_stub = 2131492950;
        public static final int action_mode_close_button = 2131492924;
        public static final int activity_chooser_view_content = 2131492925;
        public static final int alertTitle = 2131492937;
        public static final int always = 2131492914;
        public static final int beginning = 2131492912;
        public static final int bottom = 2131492892;
        public static final int buttonPanel = 2131492932;
        public static final int cancel_action = 2131492984;
        public static final int center = 2131492893;
        public static final int center_horizontal = 2131492894;
        public static final int center_vertical = 2131492895;
        public static final int checkbox = 2131492946;
        public static final int chronometer = 2131492990;
        public static final int clip_horizontal = 2131492907;
        public static final int clip_vertical = 2131492908;
        public static final int collapseActionView = 2131492915;
        public static final int contentPanel = 2131492938;
        public static final int custom = 2131492944;
        public static final int customPanel = 2131492943;
        public static final int decor_content_parent = 2131492952;
        public static final int default_activity_button = 2131492928;
        public static final int design_menu_item_action_area = 2131492980;
        public static final int design_menu_item_action_area_stub = 2131492979;
        public static final int design_menu_item_text = 2131492978;
        public static final int design_navigation_view = 2131492977;
        public static final int disableHome = 2131492878;
        public static final int edit_query = 2131492956;
        public static final int end = 2131492896;
        public static final int end_padder = 2131492995;
        public static final int enterAlways = 2131492885;
        public static final int enterAlwaysCollapsed = 2131492886;
        public static final int exitUntilCollapsed = 2131492887;
        public static final int expand_activities_button = 2131492926;
        public static final int expanded_menu = 2131492945;
        public static final int fill = 2131492909;
        public static final int fill_horizontal = 2131492910;
        public static final int fill_vertical = 2131492897;
        public static final int fixed = 2131492919;
        public static final int home = 2131492868;
        public static final int homeAsUp = 2131492879;
        public static final int icon = 2131492930;
        public static final int ifRoom = 2131492916;
        public static final int image = 2131492927;
        public static final int info = 2131492994;
        public static final int item_touch_helper_previous_elevation = 2131492869;
        public static final int left = 2131492898;
        public static final int line1 = 2131492988;
        public static final int line3 = 2131492992;
        public static final int listMode = 2131492875;
        public static final int list_item = 2131492929;
        public static final int media_actions = 2131492986;
        public static final int middle = 2131492913;
        public static final int mini = 2131492911;
        public static final int multiply = 2131492902;
        public static final int navigation_header_container = 2131492976;
        public static final int never = 2131492917;
        public static final int none = 2131492880;
        public static final int normal = 2131492876;
        public static final int parallax = 2131492890;
        public static final int parentPanel = 2131492934;
        public static final int pin = 2131492891;
        public static final int progress_circular = 2131492870;
        public static final int progress_horizontal = 2131492871;
        public static final int radio = 2131492948;
        public static final int right = 2131492899;
        public static final int screen = 2131492903;
        public static final int scroll = 2131492888;
        public static final int scrollIndicatorDown = 2131492942;
        public static final int scrollIndicatorUp = 2131492939;
        public static final int scrollView = 2131492940;
        public static final int scrollable = 2131492920;
        public static final int search_badge = 2131492958;
        public static final int search_bar = 2131492957;
        public static final int search_button = 2131492959;
        public static final int search_close_btn = 2131492964;
        public static final int search_edit_frame = 2131492960;
        public static final int search_go_btn = 2131492966;
        public static final int search_mag_icon = 2131492961;
        public static final int search_plate = 2131492962;
        public static final int search_src_text = 2131492963;
        public static final int search_voice_btn = 2131492967;
        public static final int select_dialog_listview = 2131492968;
        public static final int shortcut = 2131492947;
        public static final int showCustom = 2131492881;
        public static final int showHome = 2131492882;
        public static final int showTitle = 2131492883;
        public static final int snackbar_action = 2131492975;
        public static final int snackbar_text = 2131492974;
        public static final int snap = 2131492889;
        public static final int spacer = 2131492933;
        public static final int split_action_bar = 2131492872;
        public static final int src_atop = 2131492904;
        public static final int src_in = 2131492905;
        public static final int src_over = 2131492906;
        public static final int start = 2131492900;
        public static final int status_bar_latest_event_content = 2131492985;
        public static final int submit_area = 2131492965;
        public static final int tabMode = 2131492877;
        public static final int text = 2131492993;
        public static final int text2 = 2131492991;
        public static final int textSpacerNoButtons = 2131492941;
        public static final int time = 2131492989;
        public static final int title = 2131492931;
        public static final int title_template = 2131492936;
        public static final int top = 2131492901;
        public static final int topPanel = 2131492935;
        public static final int up = 2131492873;
        public static final int useLogo = 2131492884;
        public static final int view_offset_helper = 2131492874;
        public static final int withText = 2131492918;
        public static final int wrap_content = 2131492921;

        id(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case 2049804293:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$id"}));
            }
        }

        public static /* synthetic */ Object access$super(id idVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$id"}));
            }
        }

        public id() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$id;)V", this);
            }
        }
    }

    public static final class integer {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_config_activityDefaultDur = 2131361794;
        public static final int abc_config_activityShortDur = 2131361795;
        public static final int abc_max_action_buttons = 2131361792;
        public static final int cancel_button_image_alpha = 2131361796;
        public static final int design_snackbar_text_max_lines = 2131361793;
        public static final int status_bar_notification_info_maxnum = 2131361797;

        integer(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case -1149030206:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$integer"}));
            }
        }

        public static /* synthetic */ Object access$super(integer integer, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$integer"}));
            }
        }

        public integer() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$integer;)V", this);
            }
        }
    }

    public static final class layout {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_action_bar_title_item = 2130968576;
        public static final int abc_action_bar_up_container = 2130968577;
        public static final int abc_action_bar_view_list_nav_layout = 2130968578;
        public static final int abc_action_menu_item_layout = 2130968579;
        public static final int abc_action_menu_layout = 2130968580;
        public static final int abc_action_mode_bar = 2130968581;
        public static final int abc_action_mode_close_item_material = 2130968582;
        public static final int abc_activity_chooser_view = 2130968583;
        public static final int abc_activity_chooser_view_list_item = 2130968584;
        public static final int abc_alert_dialog_button_bar_material = 2130968585;
        public static final int abc_alert_dialog_material = 2130968586;
        public static final int abc_dialog_title_material = 2130968587;
        public static final int abc_expanded_menu_layout = 2130968588;
        public static final int abc_list_menu_item_checkbox = 2130968589;
        public static final int abc_list_menu_item_icon = 2130968590;
        public static final int abc_list_menu_item_layout = 2130968591;
        public static final int abc_list_menu_item_radio = 2130968592;
        public static final int abc_popup_menu_item_layout = 2130968593;
        public static final int abc_screen_content_include = 2130968594;
        public static final int abc_screen_simple = 2130968595;
        public static final int abc_screen_simple_overlay_action_mode = 2130968596;
        public static final int abc_screen_toolbar = 2130968597;
        public static final int abc_search_dropdown_item_icons_2line = 2130968598;
        public static final int abc_search_view = 2130968599;
        public static final int abc_select_dialog_material = 2130968600;
        public static final int design_layout_snackbar = 2130968605;
        public static final int design_layout_snackbar_include = 2130968606;
        public static final int design_layout_tab_icon = 2130968607;
        public static final int design_layout_tab_text = 2130968608;
        public static final int design_menu_item_action_area = 2130968609;
        public static final int design_navigation_item = 2130968610;
        public static final int design_navigation_item_header = 2130968611;
        public static final int design_navigation_item_separator = 2130968612;
        public static final int design_navigation_item_subheader = 2130968613;
        public static final int design_navigation_menu = 2130968614;
        public static final int design_navigation_menu_item = 2130968615;
        public static final int notification_media_action = 2130968617;
        public static final int notification_media_cancel_action = 2130968618;
        public static final int notification_template_big_media = 2130968619;
        public static final int notification_template_big_media_narrow = 2130968620;
        public static final int notification_template_lines = 2130968621;
        public static final int notification_template_media = 2130968622;
        public static final int notification_template_part_chronometer = 2130968623;
        public static final int notification_template_part_time = 2130968624;
        public static final int select_dialog_item_material = 2130968626;
        public static final int select_dialog_multichoice_material = 2130968627;
        public static final int select_dialog_singlechoice_material = 2130968628;
        public static final int support_simple_spinner_dropdown_item = 2130968629;

        layout(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case -692179692:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$layout"}));
            }
        }

        public static /* synthetic */ Object access$super(layout layout, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$layout"}));
            }
        }

        public layout() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$layout;)V", this);
            }
        }
    }

    public static final class string {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int abc_action_bar_home_description = 2131099648;
        public static final int abc_action_bar_home_description_format = 2131099649;
        public static final int abc_action_bar_home_subtitle_description_format = 2131099650;
        public static final int abc_action_bar_up_description = 2131099651;
        public static final int abc_action_menu_overflow_description = 2131099652;
        public static final int abc_action_mode_done = 2131099653;
        public static final int abc_activity_chooser_view_see_all = 2131099654;
        public static final int abc_activitychooserview_choose_application = 2131099655;
        public static final int abc_capital_off = 2131099656;
        public static final int abc_capital_on = 2131099657;
        public static final int abc_search_hint = 2131099658;
        public static final int abc_searchview_description_clear = 2131099659;
        public static final int abc_searchview_description_query = 2131099660;
        public static final int abc_searchview_description_search = 2131099661;
        public static final int abc_searchview_description_submit = 2131099662;
        public static final int abc_searchview_description_voice = 2131099663;
        public static final int abc_shareactionprovider_share_with = 2131099664;
        public static final int abc_shareactionprovider_share_with_application = 2131099665;
        public static final int abc_toolbar_collapse_description = 2131099666;
        public static final int appbar_scrolling_view_behavior = 2131099670;
        public static final int character_counter_pattern = 2131099671;
        public static final int status_bar_notification_info_overflow = 2131099667;

        string(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case 1688061563:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$string"}));
            }
        }

        public static /* synthetic */ Object access$super(string string, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$string"}));
            }
        }

        public string() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$string;)V", this);
            }
        }
    }

    public static final class style {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int AlertDialog_AppCompat = 2131296383;
        public static final int AlertDialog_AppCompat_Light = 2131296384;
        public static final int Animation_AppCompat_Dialog = 2131296385;
        public static final int Animation_AppCompat_DropDownUp = 2131296386;
        public static final int Base_AlertDialog_AppCompat = 2131296390;
        public static final int Base_AlertDialog_AppCompat_Light = 2131296391;
        public static final int Base_Animation_AppCompat_Dialog = 2131296392;
        public static final int Base_Animation_AppCompat_DropDownUp = 2131296393;
        public static final int Base_DialogWindowTitleBackground_AppCompat = 2131296395;
        public static final int Base_DialogWindowTitle_AppCompat = 2131296394;
        public static final int Base_TextAppearance_AppCompat = 2131296305;
        public static final int Base_TextAppearance_AppCompat_Body1 = 2131296306;
        public static final int Base_TextAppearance_AppCompat_Body2 = 2131296307;
        public static final int Base_TextAppearance_AppCompat_Button = 2131296282;
        public static final int Base_TextAppearance_AppCompat_Caption = 2131296308;
        public static final int Base_TextAppearance_AppCompat_Display1 = 2131296309;
        public static final int Base_TextAppearance_AppCompat_Display2 = 2131296310;
        public static final int Base_TextAppearance_AppCompat_Display3 = 2131296311;
        public static final int Base_TextAppearance_AppCompat_Display4 = 2131296312;
        public static final int Base_TextAppearance_AppCompat_Headline = 2131296313;
        public static final int Base_TextAppearance_AppCompat_Inverse = 2131296261;
        public static final int Base_TextAppearance_AppCompat_Large = 2131296314;
        public static final int Base_TextAppearance_AppCompat_Large_Inverse = 2131296262;
        public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2131296315;
        public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2131296316;
        public static final int Base_TextAppearance_AppCompat_Medium = 2131296317;
        public static final int Base_TextAppearance_AppCompat_Medium_Inverse = 2131296263;
        public static final int Base_TextAppearance_AppCompat_Menu = 2131296318;
        public static final int Base_TextAppearance_AppCompat_SearchResult = 2131296396;
        public static final int Base_TextAppearance_AppCompat_SearchResult_Subtitle = 2131296319;
        public static final int Base_TextAppearance_AppCompat_SearchResult_Title = 2131296320;
        public static final int Base_TextAppearance_AppCompat_Small = 2131296321;
        public static final int Base_TextAppearance_AppCompat_Small_Inverse = 2131296264;
        public static final int Base_TextAppearance_AppCompat_Subhead = 2131296322;
        public static final int Base_TextAppearance_AppCompat_Subhead_Inverse = 2131296265;
        public static final int Base_TextAppearance_AppCompat_Title = 2131296323;
        public static final int Base_TextAppearance_AppCompat_Title_Inverse = 2131296266;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Menu = 2131296324;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2131296325;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2131296326;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title = 2131296327;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2131296328;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2131296329;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Title = 2131296330;
        public static final int Base_TextAppearance_AppCompat_Widget_Button = 2131296331;
        public static final int Base_TextAppearance_AppCompat_Widget_Button_Inverse = 2131296379;
        public static final int Base_TextAppearance_AppCompat_Widget_DropDownItem = 2131296397;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Large = 2131296332;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Small = 2131296333;
        public static final int Base_TextAppearance_AppCompat_Widget_Switch = 2131296334;
        public static final int Base_TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2131296335;
        public static final int Base_TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2131296398;
        public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2131296336;
        public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Title = 2131296337;
        public static final int Base_ThemeOverlay_AppCompat = 2131296407;
        public static final int Base_ThemeOverlay_AppCompat_ActionBar = 2131296408;
        public static final int Base_ThemeOverlay_AppCompat_Dark = 2131296409;
        public static final int Base_ThemeOverlay_AppCompat_Dark_ActionBar = 2131296410;
        public static final int Base_ThemeOverlay_AppCompat_Light = 2131296411;
        public static final int Base_Theme_AppCompat = 2131296338;
        public static final int Base_Theme_AppCompat_CompactMenu = 2131296399;
        public static final int Base_Theme_AppCompat_Dialog = 2131296267;
        public static final int Base_Theme_AppCompat_DialogWhenLarge = 2131296258;
        public static final int Base_Theme_AppCompat_Dialog_Alert = 2131296400;
        public static final int Base_Theme_AppCompat_Dialog_FixedSize = 2131296401;
        public static final int Base_Theme_AppCompat_Dialog_MinWidth = 2131296402;
        public static final int Base_Theme_AppCompat_Light = 2131296339;
        public static final int Base_Theme_AppCompat_Light_DarkActionBar = 2131296403;
        public static final int Base_Theme_AppCompat_Light_Dialog = 2131296268;
        public static final int Base_Theme_AppCompat_Light_DialogWhenLarge = 2131296259;
        public static final int Base_Theme_AppCompat_Light_Dialog_Alert = 2131296404;
        public static final int Base_Theme_AppCompat_Light_Dialog_FixedSize = 2131296405;
        public static final int Base_Theme_AppCompat_Light_Dialog_MinWidth = 2131296406;
        public static final int Base_V11_Theme_AppCompat_Dialog = 2131296269;
        public static final int Base_V11_Theme_AppCompat_Light_Dialog = 2131296270;
        public static final int Base_V12_Widget_AppCompat_AutoCompleteTextView = 2131296278;
        public static final int Base_V12_Widget_AppCompat_EditText = 2131296279;
        public static final int Base_V21_Theme_AppCompat = 2131296340;
        public static final int Base_V21_Theme_AppCompat_Dialog = 2131296341;
        public static final int Base_V21_Theme_AppCompat_Light = 2131296342;
        public static final int Base_V21_Theme_AppCompat_Light_Dialog = 2131296343;
        public static final int Base_V22_Theme_AppCompat = 2131296377;
        public static final int Base_V22_Theme_AppCompat_Light = 2131296378;
        public static final int Base_V23_Theme_AppCompat = 2131296380;
        public static final int Base_V23_Theme_AppCompat_Light = 2131296381;
        public static final int Base_V7_Theme_AppCompat = 2131296412;
        public static final int Base_V7_Theme_AppCompat_Dialog = 2131296413;
        public static final int Base_V7_Theme_AppCompat_Light = 2131296414;
        public static final int Base_V7_Theme_AppCompat_Light_Dialog = 2131296415;
        public static final int Base_V7_Widget_AppCompat_AutoCompleteTextView = 2131296416;
        public static final int Base_V7_Widget_AppCompat_EditText = 2131296417;
        public static final int Base_Widget_AppCompat_ActionBar = 2131296418;
        public static final int Base_Widget_AppCompat_ActionBar_Solid = 2131296419;
        public static final int Base_Widget_AppCompat_ActionBar_TabBar = 2131296420;
        public static final int Base_Widget_AppCompat_ActionBar_TabText = 2131296344;
        public static final int Base_Widget_AppCompat_ActionBar_TabView = 2131296345;
        public static final int Base_Widget_AppCompat_ActionButton = 2131296346;
        public static final int Base_Widget_AppCompat_ActionButton_CloseMode = 2131296347;
        public static final int Base_Widget_AppCompat_ActionButton_Overflow = 2131296348;
        public static final int Base_Widget_AppCompat_ActionMode = 2131296421;
        public static final int Base_Widget_AppCompat_ActivityChooserView = 2131296422;
        public static final int Base_Widget_AppCompat_AutoCompleteTextView = 2131296280;
        public static final int Base_Widget_AppCompat_Button = 2131296349;
        public static final int Base_Widget_AppCompat_ButtonBar = 2131296353;
        public static final int Base_Widget_AppCompat_ButtonBar_AlertDialog = 2131296424;
        public static final int Base_Widget_AppCompat_Button_Borderless = 2131296350;
        public static final int Base_Widget_AppCompat_Button_Borderless_Colored = 2131296351;
        public static final int Base_Widget_AppCompat_Button_ButtonBar_AlertDialog = 2131296423;
        public static final int Base_Widget_AppCompat_Button_Colored = 2131296382;
        public static final int Base_Widget_AppCompat_Button_Small = 2131296352;
        public static final int Base_Widget_AppCompat_CompoundButton_CheckBox = 2131296354;
        public static final int Base_Widget_AppCompat_CompoundButton_RadioButton = 2131296355;
        public static final int Base_Widget_AppCompat_CompoundButton_Switch = 2131296425;
        public static final int Base_Widget_AppCompat_DrawerArrowToggle = 2131296256;
        public static final int Base_Widget_AppCompat_DrawerArrowToggle_Common = 2131296426;
        public static final int Base_Widget_AppCompat_DropDownItem_Spinner = 2131296356;
        public static final int Base_Widget_AppCompat_EditText = 2131296281;
        public static final int Base_Widget_AppCompat_ImageButton = 2131296357;
        public static final int Base_Widget_AppCompat_Light_ActionBar = 2131296427;
        public static final int Base_Widget_AppCompat_Light_ActionBar_Solid = 2131296428;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabBar = 2131296429;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabText = 2131296358;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2131296359;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabView = 2131296360;
        public static final int Base_Widget_AppCompat_Light_PopupMenu = 2131296361;
        public static final int Base_Widget_AppCompat_Light_PopupMenu_Overflow = 2131296362;
        public static final int Base_Widget_AppCompat_ListPopupWindow = 2131296363;
        public static final int Base_Widget_AppCompat_ListView = 2131296364;
        public static final int Base_Widget_AppCompat_ListView_DropDown = 2131296365;
        public static final int Base_Widget_AppCompat_ListView_Menu = 2131296366;
        public static final int Base_Widget_AppCompat_PopupMenu = 2131296367;
        public static final int Base_Widget_AppCompat_PopupMenu_Overflow = 2131296368;
        public static final int Base_Widget_AppCompat_PopupWindow = 2131296430;
        public static final int Base_Widget_AppCompat_ProgressBar = 2131296271;
        public static final int Base_Widget_AppCompat_ProgressBar_Horizontal = 2131296272;
        public static final int Base_Widget_AppCompat_RatingBar = 2131296369;
        public static final int Base_Widget_AppCompat_SearchView = 2131296431;
        public static final int Base_Widget_AppCompat_SearchView_ActionBar = 2131296432;
        public static final int Base_Widget_AppCompat_SeekBar = 2131296370;
        public static final int Base_Widget_AppCompat_Spinner = 2131296371;
        public static final int Base_Widget_AppCompat_Spinner_Underlined = 2131296260;
        public static final int Base_Widget_AppCompat_TextView_SpinnerItem = 2131296372;
        public static final int Base_Widget_AppCompat_Toolbar = 2131296433;
        public static final int Base_Widget_AppCompat_Toolbar_Button_Navigation = 2131296373;
        public static final int Base_Widget_Design_TabLayout = 2131296434;
        public static final int Platform_AppCompat = 2131296273;
        public static final int Platform_AppCompat_Light = 2131296274;
        public static final int Platform_ThemeOverlay_AppCompat = 2131296374;
        public static final int Platform_ThemeOverlay_AppCompat_Dark = 2131296375;
        public static final int Platform_ThemeOverlay_AppCompat_Light = 2131296376;
        public static final int Platform_V11_AppCompat = 2131296275;
        public static final int Platform_V11_AppCompat_Light = 2131296276;
        public static final int Platform_V14_AppCompat = 2131296283;
        public static final int Platform_V14_AppCompat_Light = 2131296284;
        public static final int Platform_Widget_AppCompat_Spinner = 2131296277;
        public static final int RtlOverlay_DialogWindowTitle_AppCompat = 2131296290;
        public static final int RtlOverlay_Widget_AppCompat_ActionBar_TitleItem = 2131296291;
        public static final int RtlOverlay_Widget_AppCompat_DialogTitle_Icon = 2131296292;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem = 2131296293;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_InternalGroup = 2131296294;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Text = 2131296295;
        public static final int RtlOverlay_Widget_AppCompat_SearchView_MagIcon = 2131296301;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown = 2131296296;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon1 = 2131296297;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon2 = 2131296298;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Query = 2131296299;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Text = 2131296300;
        public static final int RtlUnderlay_Widget_AppCompat_ActionButton = 2131296302;
        public static final int RtlUnderlay_Widget_AppCompat_ActionButton_Overflow = 2131296303;
        public static final int TextAppearance_AppCompat = 2131296435;
        public static final int TextAppearance_AppCompat_Body1 = 2131296436;
        public static final int TextAppearance_AppCompat_Body2 = 2131296437;
        public static final int TextAppearance_AppCompat_Button = 2131296438;
        public static final int TextAppearance_AppCompat_Caption = 2131296439;
        public static final int TextAppearance_AppCompat_Display1 = 2131296440;
        public static final int TextAppearance_AppCompat_Display2 = 2131296441;
        public static final int TextAppearance_AppCompat_Display3 = 2131296442;
        public static final int TextAppearance_AppCompat_Display4 = 2131296443;
        public static final int TextAppearance_AppCompat_Headline = 2131296444;
        public static final int TextAppearance_AppCompat_Inverse = 2131296445;
        public static final int TextAppearance_AppCompat_Large = 2131296446;
        public static final int TextAppearance_AppCompat_Large_Inverse = 2131296447;
        public static final int TextAppearance_AppCompat_Light_SearchResult_Subtitle = 2131296448;
        public static final int TextAppearance_AppCompat_Light_SearchResult_Title = 2131296449;
        public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2131296450;
        public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2131296451;
        public static final int TextAppearance_AppCompat_Medium = 2131296452;
        public static final int TextAppearance_AppCompat_Medium_Inverse = 2131296453;
        public static final int TextAppearance_AppCompat_Menu = 2131296454;
        public static final int TextAppearance_AppCompat_SearchResult_Subtitle = 2131296455;
        public static final int TextAppearance_AppCompat_SearchResult_Title = 2131296456;
        public static final int TextAppearance_AppCompat_Small = 2131296457;
        public static final int TextAppearance_AppCompat_Small_Inverse = 2131296458;
        public static final int TextAppearance_AppCompat_Subhead = 2131296459;
        public static final int TextAppearance_AppCompat_Subhead_Inverse = 2131296460;
        public static final int TextAppearance_AppCompat_Title = 2131296461;
        public static final int TextAppearance_AppCompat_Title_Inverse = 2131296462;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Menu = 2131296463;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2131296464;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2131296465;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Title = 2131296466;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2131296467;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2131296468;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle_Inverse = 2131296469;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Title = 2131296470;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Title_Inverse = 2131296471;
        public static final int TextAppearance_AppCompat_Widget_Button = 2131296472;
        public static final int TextAppearance_AppCompat_Widget_Button_Inverse = 2131296473;
        public static final int TextAppearance_AppCompat_Widget_DropDownItem = 2131296474;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Large = 2131296475;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Small = 2131296476;
        public static final int TextAppearance_AppCompat_Widget_Switch = 2131296477;
        public static final int TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2131296478;
        public static final int TextAppearance_Design_CollapsingToolbar_Expanded = 2131296479;
        public static final int TextAppearance_Design_Counter = 2131296480;
        public static final int TextAppearance_Design_Counter_Overflow = 2131296481;
        public static final int TextAppearance_Design_Error = 2131296482;
        public static final int TextAppearance_Design_Hint = 2131296483;
        public static final int TextAppearance_Design_Snackbar_Message = 2131296484;
        public static final int TextAppearance_Design_Tab = 2131296485;
        public static final int TextAppearance_StatusBar_EventContent = 2131296285;
        public static final int TextAppearance_StatusBar_EventContent_Info = 2131296286;
        public static final int TextAppearance_StatusBar_EventContent_Line2 = 2131296287;
        public static final int TextAppearance_StatusBar_EventContent_Time = 2131296288;
        public static final int TextAppearance_StatusBar_EventContent_Title = 2131296289;
        public static final int TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2131296486;
        public static final int TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2131296487;
        public static final int TextAppearance_Widget_AppCompat_Toolbar_Title = 2131296488;
        public static final int ThemeOverlay_AppCompat = 2131296503;
        public static final int ThemeOverlay_AppCompat_ActionBar = 2131296504;
        public static final int ThemeOverlay_AppCompat_Dark = 2131296505;
        public static final int ThemeOverlay_AppCompat_Dark_ActionBar = 2131296506;
        public static final int ThemeOverlay_AppCompat_Light = 2131296507;
        public static final int Theme_AppCompat = 2131296489;
        public static final int Theme_AppCompat_CompactMenu = 2131296490;
        public static final int Theme_AppCompat_Dialog = 2131296491;
        public static final int Theme_AppCompat_DialogWhenLarge = 2131296494;
        public static final int Theme_AppCompat_Dialog_Alert = 2131296492;
        public static final int Theme_AppCompat_Dialog_MinWidth = 2131296493;
        public static final int Theme_AppCompat_Light = 2131296495;
        public static final int Theme_AppCompat_Light_DarkActionBar = 2131296496;
        public static final int Theme_AppCompat_Light_Dialog = 2131296497;
        public static final int Theme_AppCompat_Light_DialogWhenLarge = 2131296500;
        public static final int Theme_AppCompat_Light_Dialog_Alert = 2131296498;
        public static final int Theme_AppCompat_Light_Dialog_MinWidth = 2131296499;
        public static final int Theme_AppCompat_Light_NoActionBar = 2131296501;
        public static final int Theme_AppCompat_NoActionBar = 2131296502;
        public static final int Widget_AppCompat_ActionBar = 2131296508;
        public static final int Widget_AppCompat_ActionBar_Solid = 2131296509;
        public static final int Widget_AppCompat_ActionBar_TabBar = 2131296510;
        public static final int Widget_AppCompat_ActionBar_TabText = 2131296511;
        public static final int Widget_AppCompat_ActionBar_TabView = 2131296512;
        public static final int Widget_AppCompat_ActionButton = 2131296513;
        public static final int Widget_AppCompat_ActionButton_CloseMode = 2131296514;
        public static final int Widget_AppCompat_ActionButton_Overflow = 2131296515;
        public static final int Widget_AppCompat_ActionMode = 2131296516;
        public static final int Widget_AppCompat_ActivityChooserView = 2131296517;
        public static final int Widget_AppCompat_AutoCompleteTextView = 2131296518;
        public static final int Widget_AppCompat_Button = 2131296519;
        public static final int Widget_AppCompat_ButtonBar = 2131296525;
        public static final int Widget_AppCompat_ButtonBar_AlertDialog = 2131296526;
        public static final int Widget_AppCompat_Button_Borderless = 2131296520;
        public static final int Widget_AppCompat_Button_Borderless_Colored = 2131296521;
        public static final int Widget_AppCompat_Button_ButtonBar_AlertDialog = 2131296522;
        public static final int Widget_AppCompat_Button_Colored = 2131296523;
        public static final int Widget_AppCompat_Button_Small = 2131296524;
        public static final int Widget_AppCompat_CompoundButton_CheckBox = 2131296527;
        public static final int Widget_AppCompat_CompoundButton_RadioButton = 2131296528;
        public static final int Widget_AppCompat_CompoundButton_Switch = 2131296529;
        public static final int Widget_AppCompat_DrawerArrowToggle = 2131296530;
        public static final int Widget_AppCompat_DropDownItem_Spinner = 2131296531;
        public static final int Widget_AppCompat_EditText = 2131296532;
        public static final int Widget_AppCompat_ImageButton = 2131296533;
        public static final int Widget_AppCompat_Light_ActionBar = 2131296534;
        public static final int Widget_AppCompat_Light_ActionBar_Solid = 2131296535;
        public static final int Widget_AppCompat_Light_ActionBar_Solid_Inverse = 2131296536;
        public static final int Widget_AppCompat_Light_ActionBar_TabBar = 2131296537;
        public static final int Widget_AppCompat_Light_ActionBar_TabBar_Inverse = 2131296538;
        public static final int Widget_AppCompat_Light_ActionBar_TabText = 2131296539;
        public static final int Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2131296540;
        public static final int Widget_AppCompat_Light_ActionBar_TabView = 2131296541;
        public static final int Widget_AppCompat_Light_ActionBar_TabView_Inverse = 2131296542;
        public static final int Widget_AppCompat_Light_ActionButton = 2131296543;
        public static final int Widget_AppCompat_Light_ActionButton_CloseMode = 2131296544;
        public static final int Widget_AppCompat_Light_ActionButton_Overflow = 2131296545;
        public static final int Widget_AppCompat_Light_ActionMode_Inverse = 2131296546;
        public static final int Widget_AppCompat_Light_ActivityChooserView = 2131296547;
        public static final int Widget_AppCompat_Light_AutoCompleteTextView = 2131296548;
        public static final int Widget_AppCompat_Light_DropDownItem_Spinner = 2131296549;
        public static final int Widget_AppCompat_Light_ListPopupWindow = 2131296550;
        public static final int Widget_AppCompat_Light_ListView_DropDown = 2131296551;
        public static final int Widget_AppCompat_Light_PopupMenu = 2131296552;
        public static final int Widget_AppCompat_Light_PopupMenu_Overflow = 2131296553;
        public static final int Widget_AppCompat_Light_SearchView = 2131296554;
        public static final int Widget_AppCompat_Light_Spinner_DropDown_ActionBar = 2131296555;
        public static final int Widget_AppCompat_ListPopupWindow = 2131296556;
        public static final int Widget_AppCompat_ListView = 2131296557;
        public static final int Widget_AppCompat_ListView_DropDown = 2131296558;
        public static final int Widget_AppCompat_ListView_Menu = 2131296559;
        public static final int Widget_AppCompat_PopupMenu = 2131296560;
        public static final int Widget_AppCompat_PopupMenu_Overflow = 2131296561;
        public static final int Widget_AppCompat_PopupWindow = 2131296562;
        public static final int Widget_AppCompat_ProgressBar = 2131296563;
        public static final int Widget_AppCompat_ProgressBar_Horizontal = 2131296564;
        public static final int Widget_AppCompat_RatingBar = 2131296565;
        public static final int Widget_AppCompat_SearchView = 2131296566;
        public static final int Widget_AppCompat_SearchView_ActionBar = 2131296567;
        public static final int Widget_AppCompat_SeekBar = 2131296568;
        public static final int Widget_AppCompat_Spinner = 2131296569;
        public static final int Widget_AppCompat_Spinner_DropDown = 2131296570;
        public static final int Widget_AppCompat_Spinner_DropDown_ActionBar = 2131296571;
        public static final int Widget_AppCompat_Spinner_Underlined = 2131296572;
        public static final int Widget_AppCompat_TextView_SpinnerItem = 2131296573;
        public static final int Widget_AppCompat_Toolbar = 2131296574;
        public static final int Widget_AppCompat_Toolbar_Button_Navigation = 2131296575;
        public static final int Widget_Design_AppBarLayout = 2131296576;
        public static final int Widget_Design_CollapsingToolbar = 2131296577;
        public static final int Widget_Design_CoordinatorLayout = 2131296578;
        public static final int Widget_Design_FloatingActionButton = 2131296579;
        public static final int Widget_Design_NavigationView = 2131296580;
        public static final int Widget_Design_ScrimInsetsFrameLayout = 2131296581;
        public static final int Widget_Design_Snackbar = 2131296582;
        public static final int Widget_Design_TabLayout = 2131296257;
        public static final int Widget_Design_TextInputLayout = 2131296583;

        style(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case 939505397:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$style"}));
            }
        }

        public static /* synthetic */ Object access$super(style style, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$style"}));
            }
        }

        public style() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$style;)V", this);
            }
        }
    }

    public static final class styleable {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final int[] ActionBar = {com.example.alvaro.apptercero.R.attr.height, com.example.alvaro.apptercero.R.attr.title, com.example.alvaro.apptercero.R.attr.navigationMode, com.example.alvaro.apptercero.R.attr.displayOptions, com.example.alvaro.apptercero.R.attr.subtitle, com.example.alvaro.apptercero.R.attr.titleTextStyle, com.example.alvaro.apptercero.R.attr.subtitleTextStyle, com.example.alvaro.apptercero.R.attr.icon, com.example.alvaro.apptercero.R.attr.logo, com.example.alvaro.apptercero.R.attr.divider, com.example.alvaro.apptercero.R.attr.background, com.example.alvaro.apptercero.R.attr.backgroundStacked, com.example.alvaro.apptercero.R.attr.backgroundSplit, com.example.alvaro.apptercero.R.attr.customNavigationLayout, com.example.alvaro.apptercero.R.attr.homeLayout, com.example.alvaro.apptercero.R.attr.progressBarStyle, com.example.alvaro.apptercero.R.attr.indeterminateProgressStyle, com.example.alvaro.apptercero.R.attr.progressBarPadding, com.example.alvaro.apptercero.R.attr.itemPadding, com.example.alvaro.apptercero.R.attr.hideOnContentScroll, com.example.alvaro.apptercero.R.attr.contentInsetStart, com.example.alvaro.apptercero.R.attr.contentInsetEnd, com.example.alvaro.apptercero.R.attr.contentInsetLeft, com.example.alvaro.apptercero.R.attr.contentInsetRight, com.example.alvaro.apptercero.R.attr.elevation, com.example.alvaro.apptercero.R.attr.popupTheme, com.example.alvaro.apptercero.R.attr.homeAsUpIndicator};
        public static final int[] ActionBarLayout = {16842931};
        public static final int ActionBarLayout_android_layout_gravity = 0;
        public static final int ActionBar_background = 10;
        public static final int ActionBar_backgroundSplit = 12;
        public static final int ActionBar_backgroundStacked = 11;
        public static final int ActionBar_contentInsetEnd = 21;
        public static final int ActionBar_contentInsetLeft = 22;
        public static final int ActionBar_contentInsetRight = 23;
        public static final int ActionBar_contentInsetStart = 20;
        public static final int ActionBar_customNavigationLayout = 13;
        public static final int ActionBar_displayOptions = 3;
        public static final int ActionBar_divider = 9;
        public static final int ActionBar_elevation = 24;
        public static final int ActionBar_height = 0;
        public static final int ActionBar_hideOnContentScroll = 19;
        public static final int ActionBar_homeAsUpIndicator = 26;
        public static final int ActionBar_homeLayout = 14;
        public static final int ActionBar_icon = 7;
        public static final int ActionBar_indeterminateProgressStyle = 16;
        public static final int ActionBar_itemPadding = 18;
        public static final int ActionBar_logo = 8;
        public static final int ActionBar_navigationMode = 2;
        public static final int ActionBar_popupTheme = 25;
        public static final int ActionBar_progressBarPadding = 17;
        public static final int ActionBar_progressBarStyle = 15;
        public static final int ActionBar_subtitle = 4;
        public static final int ActionBar_subtitleTextStyle = 6;
        public static final int ActionBar_title = 1;
        public static final int ActionBar_titleTextStyle = 5;
        public static final int[] ActionMenuItemView = {16843071};
        public static final int ActionMenuItemView_android_minWidth = 0;
        public static final int[] ActionMenuView = new int[0];
        public static final int[] ActionMode = {com.example.alvaro.apptercero.R.attr.height, com.example.alvaro.apptercero.R.attr.titleTextStyle, com.example.alvaro.apptercero.R.attr.subtitleTextStyle, com.example.alvaro.apptercero.R.attr.background, com.example.alvaro.apptercero.R.attr.backgroundSplit, com.example.alvaro.apptercero.R.attr.closeItemLayout};
        public static final int ActionMode_background = 3;
        public static final int ActionMode_backgroundSplit = 4;
        public static final int ActionMode_closeItemLayout = 5;
        public static final int ActionMode_height = 0;
        public static final int ActionMode_subtitleTextStyle = 2;
        public static final int ActionMode_titleTextStyle = 1;
        public static final int[] ActivityChooserView = {com.example.alvaro.apptercero.R.attr.initialActivityCount, com.example.alvaro.apptercero.R.attr.expandActivityOverflowButtonDrawable};
        public static final int ActivityChooserView_expandActivityOverflowButtonDrawable = 1;
        public static final int ActivityChooserView_initialActivityCount = 0;
        public static final int[] AlertDialog = {16842994, com.example.alvaro.apptercero.R.attr.buttonPanelSideLayout, com.example.alvaro.apptercero.R.attr.listLayout, com.example.alvaro.apptercero.R.attr.multiChoiceItemLayout, com.example.alvaro.apptercero.R.attr.singleChoiceItemLayout, com.example.alvaro.apptercero.R.attr.listItemLayout};
        public static final int AlertDialog_android_layout = 0;
        public static final int AlertDialog_buttonPanelSideLayout = 1;
        public static final int AlertDialog_listItemLayout = 5;
        public static final int AlertDialog_listLayout = 2;
        public static final int AlertDialog_multiChoiceItemLayout = 3;
        public static final int AlertDialog_singleChoiceItemLayout = 4;
        public static final int[] AppBarLayout = {16842964, com.example.alvaro.apptercero.R.attr.elevation, com.example.alvaro.apptercero.R.attr.expanded};
        public static final int[] AppBarLayout_LayoutParams = {com.example.alvaro.apptercero.R.attr.layout_scrollFlags, com.example.alvaro.apptercero.R.attr.layout_scrollInterpolator};
        public static final int AppBarLayout_LayoutParams_layout_scrollFlags = 0;
        public static final int AppBarLayout_LayoutParams_layout_scrollInterpolator = 1;
        public static final int AppBarLayout_android_background = 0;
        public static final int AppBarLayout_elevation = 1;
        public static final int AppBarLayout_expanded = 2;
        public static final int[] AppCompatTextView = {16842804, com.example.alvaro.apptercero.R.attr.textAllCaps};
        public static final int AppCompatTextView_android_textAppearance = 0;
        public static final int AppCompatTextView_textAllCaps = 1;
        public static final int[] ButtonBarLayout = {com.example.alvaro.apptercero.R.attr.allowStacking};
        public static final int ButtonBarLayout_allowStacking = 0;
        public static final int[] CollapsingAppBarLayout_LayoutParams = {com.example.alvaro.apptercero.R.attr.layout_collapseMode, com.example.alvaro.apptercero.R.attr.layout_collapseParallaxMultiplier};
        public static final int CollapsingAppBarLayout_LayoutParams_layout_collapseMode = 0;
        public static final int CollapsingAppBarLayout_LayoutParams_layout_collapseParallaxMultiplier = 1;
        public static final int[] CollapsingToolbarLayout = {com.example.alvaro.apptercero.R.attr.title, com.example.alvaro.apptercero.R.attr.expandedTitleMargin, com.example.alvaro.apptercero.R.attr.expandedTitleMarginStart, com.example.alvaro.apptercero.R.attr.expandedTitleMarginTop, com.example.alvaro.apptercero.R.attr.expandedTitleMarginEnd, com.example.alvaro.apptercero.R.attr.expandedTitleMarginBottom, com.example.alvaro.apptercero.R.attr.expandedTitleTextAppearance, com.example.alvaro.apptercero.R.attr.collapsedTitleTextAppearance, com.example.alvaro.apptercero.R.attr.contentScrim, com.example.alvaro.apptercero.R.attr.statusBarScrim, com.example.alvaro.apptercero.R.attr.toolbarId, com.example.alvaro.apptercero.R.attr.collapsedTitleGravity, com.example.alvaro.apptercero.R.attr.expandedTitleGravity, com.example.alvaro.apptercero.R.attr.titleEnabled};
        public static final int CollapsingToolbarLayout_collapsedTitleGravity = 11;
        public static final int CollapsingToolbarLayout_collapsedTitleTextAppearance = 7;
        public static final int CollapsingToolbarLayout_contentScrim = 8;
        public static final int CollapsingToolbarLayout_expandedTitleGravity = 12;
        public static final int CollapsingToolbarLayout_expandedTitleMargin = 1;
        public static final int CollapsingToolbarLayout_expandedTitleMarginBottom = 5;
        public static final int CollapsingToolbarLayout_expandedTitleMarginEnd = 4;
        public static final int CollapsingToolbarLayout_expandedTitleMarginStart = 2;
        public static final int CollapsingToolbarLayout_expandedTitleMarginTop = 3;
        public static final int CollapsingToolbarLayout_expandedTitleTextAppearance = 6;
        public static final int CollapsingToolbarLayout_statusBarScrim = 9;
        public static final int CollapsingToolbarLayout_title = 0;
        public static final int CollapsingToolbarLayout_titleEnabled = 13;
        public static final int CollapsingToolbarLayout_toolbarId = 10;
        public static final int[] CompoundButton = {16843015, com.example.alvaro.apptercero.R.attr.buttonTint, com.example.alvaro.apptercero.R.attr.buttonTintMode};
        public static final int CompoundButton_android_button = 0;
        public static final int CompoundButton_buttonTint = 1;
        public static final int CompoundButton_buttonTintMode = 2;
        public static final int[] CoordinatorLayout = {com.example.alvaro.apptercero.R.attr.keylines, com.example.alvaro.apptercero.R.attr.statusBarBackground};
        public static final int[] CoordinatorLayout_LayoutParams = {16842931, com.example.alvaro.apptercero.R.attr.layout_behavior, com.example.alvaro.apptercero.R.attr.layout_anchor, com.example.alvaro.apptercero.R.attr.layout_keyline, com.example.alvaro.apptercero.R.attr.layout_anchorGravity};
        public static final int CoordinatorLayout_LayoutParams_android_layout_gravity = 0;
        public static final int CoordinatorLayout_LayoutParams_layout_anchor = 2;
        public static final int CoordinatorLayout_LayoutParams_layout_anchorGravity = 4;
        public static final int CoordinatorLayout_LayoutParams_layout_behavior = 1;
        public static final int CoordinatorLayout_LayoutParams_layout_keyline = 3;
        public static final int CoordinatorLayout_keylines = 0;
        public static final int CoordinatorLayout_statusBarBackground = 1;
        public static final int[] DrawerArrowToggle = {com.example.alvaro.apptercero.R.attr.color, com.example.alvaro.apptercero.R.attr.spinBars, com.example.alvaro.apptercero.R.attr.drawableSize, com.example.alvaro.apptercero.R.attr.gapBetweenBars, com.example.alvaro.apptercero.R.attr.arrowHeadLength, com.example.alvaro.apptercero.R.attr.arrowShaftLength, com.example.alvaro.apptercero.R.attr.barLength, com.example.alvaro.apptercero.R.attr.thickness};
        public static final int DrawerArrowToggle_arrowHeadLength = 4;
        public static final int DrawerArrowToggle_arrowShaftLength = 5;
        public static final int DrawerArrowToggle_barLength = 6;
        public static final int DrawerArrowToggle_color = 0;
        public static final int DrawerArrowToggle_drawableSize = 2;
        public static final int DrawerArrowToggle_gapBetweenBars = 3;
        public static final int DrawerArrowToggle_spinBars = 1;
        public static final int DrawerArrowToggle_thickness = 7;
        public static final int[] FloatingActionButton = {com.example.alvaro.apptercero.R.attr.elevation, com.example.alvaro.apptercero.R.attr.rippleColor, com.example.alvaro.apptercero.R.attr.fabSize, com.example.alvaro.apptercero.R.attr.pressedTranslationZ, com.example.alvaro.apptercero.R.attr.borderWidth, com.example.alvaro.apptercero.R.attr.backgroundTint, com.example.alvaro.apptercero.R.attr.backgroundTintMode};
        public static final int FloatingActionButton_backgroundTint = 5;
        public static final int FloatingActionButton_backgroundTintMode = 6;
        public static final int FloatingActionButton_borderWidth = 4;
        public static final int FloatingActionButton_elevation = 0;
        public static final int FloatingActionButton_fabSize = 2;
        public static final int FloatingActionButton_pressedTranslationZ = 3;
        public static final int FloatingActionButton_rippleColor = 1;
        public static final int[] ForegroundLinearLayout = {16843017, 16843264, com.example.alvaro.apptercero.R.attr.foregroundInsidePadding};
        public static final int ForegroundLinearLayout_android_foreground = 0;
        public static final int ForegroundLinearLayout_android_foregroundGravity = 1;
        public static final int ForegroundLinearLayout_foregroundInsidePadding = 2;
        public static final int[] LinearLayoutCompat = {16842927, 16842948, 16843046, 16843047, 16843048, com.example.alvaro.apptercero.R.attr.divider, com.example.alvaro.apptercero.R.attr.measureWithLargestChild, com.example.alvaro.apptercero.R.attr.showDividers, com.example.alvaro.apptercero.R.attr.dividerPadding};
        public static final int[] LinearLayoutCompat_Layout = {16842931, 16842996, 16842997, 16843137};
        public static final int LinearLayoutCompat_Layout_android_layout_gravity = 0;
        public static final int LinearLayoutCompat_Layout_android_layout_height = 2;
        public static final int LinearLayoutCompat_Layout_android_layout_weight = 3;
        public static final int LinearLayoutCompat_Layout_android_layout_width = 1;
        public static final int LinearLayoutCompat_android_baselineAligned = 2;
        public static final int LinearLayoutCompat_android_baselineAlignedChildIndex = 3;
        public static final int LinearLayoutCompat_android_gravity = 0;
        public static final int LinearLayoutCompat_android_orientation = 1;
        public static final int LinearLayoutCompat_android_weightSum = 4;
        public static final int LinearLayoutCompat_divider = 5;
        public static final int LinearLayoutCompat_dividerPadding = 8;
        public static final int LinearLayoutCompat_measureWithLargestChild = 6;
        public static final int LinearLayoutCompat_showDividers = 7;
        public static final int[] ListPopupWindow = {16843436, 16843437};
        public static final int ListPopupWindow_android_dropDownHorizontalOffset = 0;
        public static final int ListPopupWindow_android_dropDownVerticalOffset = 1;
        public static final int[] MenuGroup = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
        public static final int MenuGroup_android_checkableBehavior = 5;
        public static final int MenuGroup_android_enabled = 0;
        public static final int MenuGroup_android_id = 1;
        public static final int MenuGroup_android_menuCategory = 3;
        public static final int MenuGroup_android_orderInCategory = 4;
        public static final int MenuGroup_android_visible = 2;
        public static final int[] MenuItem = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, com.example.alvaro.apptercero.R.attr.showAsAction, com.example.alvaro.apptercero.R.attr.actionLayout, com.example.alvaro.apptercero.R.attr.actionViewClass, com.example.alvaro.apptercero.R.attr.actionProviderClass};
        public static final int MenuItem_actionLayout = 14;
        public static final int MenuItem_actionProviderClass = 16;
        public static final int MenuItem_actionViewClass = 15;
        public static final int MenuItem_android_alphabeticShortcut = 9;
        public static final int MenuItem_android_checkable = 11;
        public static final int MenuItem_android_checked = 3;
        public static final int MenuItem_android_enabled = 1;
        public static final int MenuItem_android_icon = 0;
        public static final int MenuItem_android_id = 2;
        public static final int MenuItem_android_menuCategory = 5;
        public static final int MenuItem_android_numericShortcut = 10;
        public static final int MenuItem_android_onClick = 12;
        public static final int MenuItem_android_orderInCategory = 6;
        public static final int MenuItem_android_title = 7;
        public static final int MenuItem_android_titleCondensed = 8;
        public static final int MenuItem_android_visible = 4;
        public static final int MenuItem_showAsAction = 13;
        public static final int[] MenuView = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, com.example.alvaro.apptercero.R.attr.preserveIconSpacing};
        public static final int MenuView_android_headerBackground = 4;
        public static final int MenuView_android_horizontalDivider = 2;
        public static final int MenuView_android_itemBackground = 5;
        public static final int MenuView_android_itemIconDisabledAlpha = 6;
        public static final int MenuView_android_itemTextAppearance = 1;
        public static final int MenuView_android_verticalDivider = 3;
        public static final int MenuView_android_windowAnimationStyle = 0;
        public static final int MenuView_preserveIconSpacing = 7;
        public static final int[] NavigationView = {16842964, 16842973, 16843039, com.example.alvaro.apptercero.R.attr.elevation, com.example.alvaro.apptercero.R.attr.menu, com.example.alvaro.apptercero.R.attr.itemIconTint, com.example.alvaro.apptercero.R.attr.itemTextColor, com.example.alvaro.apptercero.R.attr.itemBackground, com.example.alvaro.apptercero.R.attr.itemTextAppearance, com.example.alvaro.apptercero.R.attr.headerLayout};
        public static final int NavigationView_android_background = 0;
        public static final int NavigationView_android_fitsSystemWindows = 1;
        public static final int NavigationView_android_maxWidth = 2;
        public static final int NavigationView_elevation = 3;
        public static final int NavigationView_headerLayout = 9;
        public static final int NavigationView_itemBackground = 7;
        public static final int NavigationView_itemIconTint = 5;
        public static final int NavigationView_itemTextAppearance = 8;
        public static final int NavigationView_itemTextColor = 6;
        public static final int NavigationView_menu = 4;
        public static final int[] PopupWindow = {16843126, com.example.alvaro.apptercero.R.attr.overlapAnchor};
        public static final int[] PopupWindowBackgroundState = {com.example.alvaro.apptercero.R.attr.state_above_anchor};
        public static final int PopupWindowBackgroundState_state_above_anchor = 0;
        public static final int PopupWindow_android_popupBackground = 0;
        public static final int PopupWindow_overlapAnchor = 1;
        public static final int[] RecyclerView = {16842948, com.example.alvaro.apptercero.R.attr.layoutManager, com.example.alvaro.apptercero.R.attr.spanCount, com.example.alvaro.apptercero.R.attr.reverseLayout, com.example.alvaro.apptercero.R.attr.stackFromEnd};
        public static final int RecyclerView_android_orientation = 0;
        public static final int RecyclerView_layoutManager = 1;
        public static final int RecyclerView_reverseLayout = 3;
        public static final int RecyclerView_spanCount = 2;
        public static final int RecyclerView_stackFromEnd = 4;
        public static final int[] ScrimInsetsFrameLayout = {com.example.alvaro.apptercero.R.attr.insetForeground};
        public static final int ScrimInsetsFrameLayout_insetForeground = 0;
        public static final int[] ScrollingViewBehavior_Params = {com.example.alvaro.apptercero.R.attr.behavior_overlapTop};
        public static final int ScrollingViewBehavior_Params_behavior_overlapTop = 0;
        public static final int[] SearchView = {16842970, 16843039, 16843296, 16843364, com.example.alvaro.apptercero.R.attr.layout, com.example.alvaro.apptercero.R.attr.iconifiedByDefault, com.example.alvaro.apptercero.R.attr.queryHint, com.example.alvaro.apptercero.R.attr.defaultQueryHint, com.example.alvaro.apptercero.R.attr.closeIcon, com.example.alvaro.apptercero.R.attr.goIcon, com.example.alvaro.apptercero.R.attr.searchIcon, com.example.alvaro.apptercero.R.attr.searchHintIcon, com.example.alvaro.apptercero.R.attr.voiceIcon, com.example.alvaro.apptercero.R.attr.commitIcon, com.example.alvaro.apptercero.R.attr.suggestionRowLayout, com.example.alvaro.apptercero.R.attr.queryBackground, com.example.alvaro.apptercero.R.attr.submitBackground};
        public static final int SearchView_android_focusable = 0;
        public static final int SearchView_android_imeOptions = 3;
        public static final int SearchView_android_inputType = 2;
        public static final int SearchView_android_maxWidth = 1;
        public static final int SearchView_closeIcon = 8;
        public static final int SearchView_commitIcon = 13;
        public static final int SearchView_defaultQueryHint = 7;
        public static final int SearchView_goIcon = 9;
        public static final int SearchView_iconifiedByDefault = 5;
        public static final int SearchView_layout = 4;
        public static final int SearchView_queryBackground = 15;
        public static final int SearchView_queryHint = 6;
        public static final int SearchView_searchHintIcon = 11;
        public static final int SearchView_searchIcon = 10;
        public static final int SearchView_submitBackground = 16;
        public static final int SearchView_suggestionRowLayout = 14;
        public static final int SearchView_voiceIcon = 12;
        public static final int[] SnackbarLayout = {16843039, com.example.alvaro.apptercero.R.attr.elevation, com.example.alvaro.apptercero.R.attr.maxActionInlineWidth};
        public static final int SnackbarLayout_android_maxWidth = 0;
        public static final int SnackbarLayout_elevation = 1;
        public static final int SnackbarLayout_maxActionInlineWidth = 2;
        public static final int[] Spinner = {16843126, 16843131, 16843362, com.example.alvaro.apptercero.R.attr.popupTheme};
        public static final int Spinner_android_dropDownWidth = 2;
        public static final int Spinner_android_popupBackground = 0;
        public static final int Spinner_android_prompt = 1;
        public static final int Spinner_popupTheme = 3;
        public static final int[] SwitchCompat = {16843044, 16843045, 16843074, com.example.alvaro.apptercero.R.attr.track, com.example.alvaro.apptercero.R.attr.thumbTextPadding, com.example.alvaro.apptercero.R.attr.switchTextAppearance, com.example.alvaro.apptercero.R.attr.switchMinWidth, com.example.alvaro.apptercero.R.attr.switchPadding, com.example.alvaro.apptercero.R.attr.splitTrack, com.example.alvaro.apptercero.R.attr.showText};
        public static final int SwitchCompat_android_textOff = 1;
        public static final int SwitchCompat_android_textOn = 0;
        public static final int SwitchCompat_android_thumb = 2;
        public static final int SwitchCompat_showText = 9;
        public static final int SwitchCompat_splitTrack = 8;
        public static final int SwitchCompat_switchMinWidth = 6;
        public static final int SwitchCompat_switchPadding = 7;
        public static final int SwitchCompat_switchTextAppearance = 5;
        public static final int SwitchCompat_thumbTextPadding = 4;
        public static final int SwitchCompat_track = 3;
        public static final int[] TabLayout = {com.example.alvaro.apptercero.R.attr.tabIndicatorColor, com.example.alvaro.apptercero.R.attr.tabIndicatorHeight, com.example.alvaro.apptercero.R.attr.tabContentStart, com.example.alvaro.apptercero.R.attr.tabBackground, com.example.alvaro.apptercero.R.attr.tabMode, com.example.alvaro.apptercero.R.attr.tabGravity, com.example.alvaro.apptercero.R.attr.tabMinWidth, com.example.alvaro.apptercero.R.attr.tabMaxWidth, com.example.alvaro.apptercero.R.attr.tabTextAppearance, com.example.alvaro.apptercero.R.attr.tabTextColor, com.example.alvaro.apptercero.R.attr.tabSelectedTextColor, com.example.alvaro.apptercero.R.attr.tabPaddingStart, com.example.alvaro.apptercero.R.attr.tabPaddingTop, com.example.alvaro.apptercero.R.attr.tabPaddingEnd, com.example.alvaro.apptercero.R.attr.tabPaddingBottom, com.example.alvaro.apptercero.R.attr.tabPadding};
        public static final int TabLayout_tabBackground = 3;
        public static final int TabLayout_tabContentStart = 2;
        public static final int TabLayout_tabGravity = 5;
        public static final int TabLayout_tabIndicatorColor = 0;
        public static final int TabLayout_tabIndicatorHeight = 1;
        public static final int TabLayout_tabMaxWidth = 7;
        public static final int TabLayout_tabMinWidth = 6;
        public static final int TabLayout_tabMode = 4;
        public static final int TabLayout_tabPadding = 15;
        public static final int TabLayout_tabPaddingBottom = 14;
        public static final int TabLayout_tabPaddingEnd = 13;
        public static final int TabLayout_tabPaddingStart = 11;
        public static final int TabLayout_tabPaddingTop = 12;
        public static final int TabLayout_tabSelectedTextColor = 10;
        public static final int TabLayout_tabTextAppearance = 8;
        public static final int TabLayout_tabTextColor = 9;
        public static final int[] TextAppearance = {16842901, 16842902, 16842903, 16842904, 16843105, 16843106, 16843107, 16843108, com.example.alvaro.apptercero.R.attr.textAllCaps};
        public static final int TextAppearance_android_shadowColor = 4;
        public static final int TextAppearance_android_shadowDx = 5;
        public static final int TextAppearance_android_shadowDy = 6;
        public static final int TextAppearance_android_shadowRadius = 7;
        public static final int TextAppearance_android_textColor = 3;
        public static final int TextAppearance_android_textSize = 0;
        public static final int TextAppearance_android_textStyle = 2;
        public static final int TextAppearance_android_typeface = 1;
        public static final int TextAppearance_textAllCaps = 8;
        public static final int[] TextInputLayout = {16842906, 16843088, com.example.alvaro.apptercero.R.attr.hintTextAppearance, com.example.alvaro.apptercero.R.attr.errorEnabled, com.example.alvaro.apptercero.R.attr.errorTextAppearance, com.example.alvaro.apptercero.R.attr.counterEnabled, com.example.alvaro.apptercero.R.attr.counterMaxLength, com.example.alvaro.apptercero.R.attr.counterTextAppearance, com.example.alvaro.apptercero.R.attr.counterOverflowTextAppearance, com.example.alvaro.apptercero.R.attr.hintAnimationEnabled};
        public static final int TextInputLayout_android_hint = 1;
        public static final int TextInputLayout_android_textColorHint = 0;
        public static final int TextInputLayout_counterEnabled = 5;
        public static final int TextInputLayout_counterMaxLength = 6;
        public static final int TextInputLayout_counterOverflowTextAppearance = 8;
        public static final int TextInputLayout_counterTextAppearance = 7;
        public static final int TextInputLayout_errorEnabled = 3;
        public static final int TextInputLayout_errorTextAppearance = 4;
        public static final int TextInputLayout_hintAnimationEnabled = 9;
        public static final int TextInputLayout_hintTextAppearance = 2;
        public static final int[] Theme = {16842839, 16842926, com.example.alvaro.apptercero.R.attr.windowActionBar, com.example.alvaro.apptercero.R.attr.windowNoTitle, com.example.alvaro.apptercero.R.attr.windowActionBarOverlay, com.example.alvaro.apptercero.R.attr.windowActionModeOverlay, com.example.alvaro.apptercero.R.attr.windowFixedWidthMajor, com.example.alvaro.apptercero.R.attr.windowFixedHeightMinor, com.example.alvaro.apptercero.R.attr.windowFixedWidthMinor, com.example.alvaro.apptercero.R.attr.windowFixedHeightMajor, com.example.alvaro.apptercero.R.attr.windowMinWidthMajor, com.example.alvaro.apptercero.R.attr.windowMinWidthMinor, com.example.alvaro.apptercero.R.attr.actionBarTabStyle, com.example.alvaro.apptercero.R.attr.actionBarTabBarStyle, com.example.alvaro.apptercero.R.attr.actionBarTabTextStyle, com.example.alvaro.apptercero.R.attr.actionOverflowButtonStyle, com.example.alvaro.apptercero.R.attr.actionOverflowMenuStyle, com.example.alvaro.apptercero.R.attr.actionBarPopupTheme, com.example.alvaro.apptercero.R.attr.actionBarStyle, com.example.alvaro.apptercero.R.attr.actionBarSplitStyle, com.example.alvaro.apptercero.R.attr.actionBarTheme, com.example.alvaro.apptercero.R.attr.actionBarWidgetTheme, com.example.alvaro.apptercero.R.attr.actionBarSize, com.example.alvaro.apptercero.R.attr.actionBarDivider, com.example.alvaro.apptercero.R.attr.actionBarItemBackground, com.example.alvaro.apptercero.R.attr.actionMenuTextAppearance, com.example.alvaro.apptercero.R.attr.actionMenuTextColor, com.example.alvaro.apptercero.R.attr.actionModeStyle, com.example.alvaro.apptercero.R.attr.actionModeCloseButtonStyle, com.example.alvaro.apptercero.R.attr.actionModeBackground, com.example.alvaro.apptercero.R.attr.actionModeSplitBackground, com.example.alvaro.apptercero.R.attr.actionModeCloseDrawable, com.example.alvaro.apptercero.R.attr.actionModeCutDrawable, com.example.alvaro.apptercero.R.attr.actionModeCopyDrawable, com.example.alvaro.apptercero.R.attr.actionModePasteDrawable, com.example.alvaro.apptercero.R.attr.actionModeSelectAllDrawable, com.example.alvaro.apptercero.R.attr.actionModeShareDrawable, com.example.alvaro.apptercero.R.attr.actionModeFindDrawable, com.example.alvaro.apptercero.R.attr.actionModeWebSearchDrawable, com.example.alvaro.apptercero.R.attr.actionModePopupWindowStyle, com.example.alvaro.apptercero.R.attr.textAppearanceLargePopupMenu, com.example.alvaro.apptercero.R.attr.textAppearanceSmallPopupMenu, com.example.alvaro.apptercero.R.attr.dialogTheme, com.example.alvaro.apptercero.R.attr.dialogPreferredPadding, com.example.alvaro.apptercero.R.attr.listDividerAlertDialog, com.example.alvaro.apptercero.R.attr.actionDropDownStyle, com.example.alvaro.apptercero.R.attr.dropdownListPreferredItemHeight, com.example.alvaro.apptercero.R.attr.spinnerDropDownItemStyle, com.example.alvaro.apptercero.R.attr.homeAsUpIndicator, com.example.alvaro.apptercero.R.attr.actionButtonStyle, com.example.alvaro.apptercero.R.attr.buttonBarStyle, com.example.alvaro.apptercero.R.attr.buttonBarButtonStyle, com.example.alvaro.apptercero.R.attr.selectableItemBackground, com.example.alvaro.apptercero.R.attr.selectableItemBackgroundBorderless, com.example.alvaro.apptercero.R.attr.borderlessButtonStyle, com.example.alvaro.apptercero.R.attr.dividerVertical, com.example.alvaro.apptercero.R.attr.dividerHorizontal, com.example.alvaro.apptercero.R.attr.activityChooserViewStyle, com.example.alvaro.apptercero.R.attr.toolbarStyle, com.example.alvaro.apptercero.R.attr.toolbarNavigationButtonStyle, com.example.alvaro.apptercero.R.attr.popupMenuStyle, com.example.alvaro.apptercero.R.attr.popupWindowStyle, com.example.alvaro.apptercero.R.attr.editTextColor, com.example.alvaro.apptercero.R.attr.editTextBackground, com.example.alvaro.apptercero.R.attr.imageButtonStyle, com.example.alvaro.apptercero.R.attr.textAppearanceSearchResultTitle, com.example.alvaro.apptercero.R.attr.textAppearanceSearchResultSubtitle, com.example.alvaro.apptercero.R.attr.textColorSearchUrl, com.example.alvaro.apptercero.R.attr.searchViewStyle, com.example.alvaro.apptercero.R.attr.listPreferredItemHeight, com.example.alvaro.apptercero.R.attr.listPreferredItemHeightSmall, com.example.alvaro.apptercero.R.attr.listPreferredItemHeightLarge, com.example.alvaro.apptercero.R.attr.listPreferredItemPaddingLeft, com.example.alvaro.apptercero.R.attr.listPreferredItemPaddingRight, com.example.alvaro.apptercero.R.attr.dropDownListViewStyle, com.example.alvaro.apptercero.R.attr.listPopupWindowStyle, com.example.alvaro.apptercero.R.attr.textAppearanceListItem, com.example.alvaro.apptercero.R.attr.textAppearanceListItemSmall, com.example.alvaro.apptercero.R.attr.panelBackground, com.example.alvaro.apptercero.R.attr.panelMenuListWidth, com.example.alvaro.apptercero.R.attr.panelMenuListTheme, com.example.alvaro.apptercero.R.attr.listChoiceBackgroundIndicator, com.example.alvaro.apptercero.R.attr.colorPrimary, com.example.alvaro.apptercero.R.attr.colorPrimaryDark, com.example.alvaro.apptercero.R.attr.colorAccent, com.example.alvaro.apptercero.R.attr.colorControlNormal, com.example.alvaro.apptercero.R.attr.colorControlActivated, com.example.alvaro.apptercero.R.attr.colorControlHighlight, com.example.alvaro.apptercero.R.attr.colorButtonNormal, com.example.alvaro.apptercero.R.attr.colorSwitchThumbNormal, com.example.alvaro.apptercero.R.attr.controlBackground, com.example.alvaro.apptercero.R.attr.alertDialogStyle, com.example.alvaro.apptercero.R.attr.alertDialogButtonGroupStyle, com.example.alvaro.apptercero.R.attr.alertDialogCenterButtons, com.example.alvaro.apptercero.R.attr.alertDialogTheme, com.example.alvaro.apptercero.R.attr.textColorAlertDialogListItem, com.example.alvaro.apptercero.R.attr.buttonBarPositiveButtonStyle, com.example.alvaro.apptercero.R.attr.buttonBarNegativeButtonStyle, com.example.alvaro.apptercero.R.attr.buttonBarNeutralButtonStyle, com.example.alvaro.apptercero.R.attr.autoCompleteTextViewStyle, com.example.alvaro.apptercero.R.attr.buttonStyle, com.example.alvaro.apptercero.R.attr.buttonStyleSmall, com.example.alvaro.apptercero.R.attr.checkboxStyle, com.example.alvaro.apptercero.R.attr.checkedTextViewStyle, com.example.alvaro.apptercero.R.attr.editTextStyle, com.example.alvaro.apptercero.R.attr.radioButtonStyle, com.example.alvaro.apptercero.R.attr.ratingBarStyle, com.example.alvaro.apptercero.R.attr.seekBarStyle, com.example.alvaro.apptercero.R.attr.spinnerStyle, com.example.alvaro.apptercero.R.attr.switchStyle};
        public static final int Theme_actionBarDivider = 23;
        public static final int Theme_actionBarItemBackground = 24;
        public static final int Theme_actionBarPopupTheme = 17;
        public static final int Theme_actionBarSize = 22;
        public static final int Theme_actionBarSplitStyle = 19;
        public static final int Theme_actionBarStyle = 18;
        public static final int Theme_actionBarTabBarStyle = 13;
        public static final int Theme_actionBarTabStyle = 12;
        public static final int Theme_actionBarTabTextStyle = 14;
        public static final int Theme_actionBarTheme = 20;
        public static final int Theme_actionBarWidgetTheme = 21;
        public static final int Theme_actionButtonStyle = 49;
        public static final int Theme_actionDropDownStyle = 45;
        public static final int Theme_actionMenuTextAppearance = 25;
        public static final int Theme_actionMenuTextColor = 26;
        public static final int Theme_actionModeBackground = 29;
        public static final int Theme_actionModeCloseButtonStyle = 28;
        public static final int Theme_actionModeCloseDrawable = 31;
        public static final int Theme_actionModeCopyDrawable = 33;
        public static final int Theme_actionModeCutDrawable = 32;
        public static final int Theme_actionModeFindDrawable = 37;
        public static final int Theme_actionModePasteDrawable = 34;
        public static final int Theme_actionModePopupWindowStyle = 39;
        public static final int Theme_actionModeSelectAllDrawable = 35;
        public static final int Theme_actionModeShareDrawable = 36;
        public static final int Theme_actionModeSplitBackground = 30;
        public static final int Theme_actionModeStyle = 27;
        public static final int Theme_actionModeWebSearchDrawable = 38;
        public static final int Theme_actionOverflowButtonStyle = 15;
        public static final int Theme_actionOverflowMenuStyle = 16;
        public static final int Theme_activityChooserViewStyle = 57;
        public static final int Theme_alertDialogButtonGroupStyle = 92;
        public static final int Theme_alertDialogCenterButtons = 93;
        public static final int Theme_alertDialogStyle = 91;
        public static final int Theme_alertDialogTheme = 94;
        public static final int Theme_android_windowAnimationStyle = 1;
        public static final int Theme_android_windowIsFloating = 0;
        public static final int Theme_autoCompleteTextViewStyle = 99;
        public static final int Theme_borderlessButtonStyle = 54;
        public static final int Theme_buttonBarButtonStyle = 51;
        public static final int Theme_buttonBarNegativeButtonStyle = 97;
        public static final int Theme_buttonBarNeutralButtonStyle = 98;
        public static final int Theme_buttonBarPositiveButtonStyle = 96;
        public static final int Theme_buttonBarStyle = 50;
        public static final int Theme_buttonStyle = 100;
        public static final int Theme_buttonStyleSmall = 101;
        public static final int Theme_checkboxStyle = 102;
        public static final int Theme_checkedTextViewStyle = 103;
        public static final int Theme_colorAccent = 84;
        public static final int Theme_colorButtonNormal = 88;
        public static final int Theme_colorControlActivated = 86;
        public static final int Theme_colorControlHighlight = 87;
        public static final int Theme_colorControlNormal = 85;
        public static final int Theme_colorPrimary = 82;
        public static final int Theme_colorPrimaryDark = 83;
        public static final int Theme_colorSwitchThumbNormal = 89;
        public static final int Theme_controlBackground = 90;
        public static final int Theme_dialogPreferredPadding = 43;
        public static final int Theme_dialogTheme = 42;
        public static final int Theme_dividerHorizontal = 56;
        public static final int Theme_dividerVertical = 55;
        public static final int Theme_dropDownListViewStyle = 74;
        public static final int Theme_dropdownListPreferredItemHeight = 46;
        public static final int Theme_editTextBackground = 63;
        public static final int Theme_editTextColor = 62;
        public static final int Theme_editTextStyle = 104;
        public static final int Theme_homeAsUpIndicator = 48;
        public static final int Theme_imageButtonStyle = 64;
        public static final int Theme_listChoiceBackgroundIndicator = 81;
        public static final int Theme_listDividerAlertDialog = 44;
        public static final int Theme_listPopupWindowStyle = 75;
        public static final int Theme_listPreferredItemHeight = 69;
        public static final int Theme_listPreferredItemHeightLarge = 71;
        public static final int Theme_listPreferredItemHeightSmall = 70;
        public static final int Theme_listPreferredItemPaddingLeft = 72;
        public static final int Theme_listPreferredItemPaddingRight = 73;
        public static final int Theme_panelBackground = 78;
        public static final int Theme_panelMenuListTheme = 80;
        public static final int Theme_panelMenuListWidth = 79;
        public static final int Theme_popupMenuStyle = 60;
        public static final int Theme_popupWindowStyle = 61;
        public static final int Theme_radioButtonStyle = 105;
        public static final int Theme_ratingBarStyle = 106;
        public static final int Theme_searchViewStyle = 68;
        public static final int Theme_seekBarStyle = 107;
        public static final int Theme_selectableItemBackground = 52;
        public static final int Theme_selectableItemBackgroundBorderless = 53;
        public static final int Theme_spinnerDropDownItemStyle = 47;
        public static final int Theme_spinnerStyle = 108;
        public static final int Theme_switchStyle = 109;
        public static final int Theme_textAppearanceLargePopupMenu = 40;
        public static final int Theme_textAppearanceListItem = 76;
        public static final int Theme_textAppearanceListItemSmall = 77;
        public static final int Theme_textAppearanceSearchResultSubtitle = 66;
        public static final int Theme_textAppearanceSearchResultTitle = 65;
        public static final int Theme_textAppearanceSmallPopupMenu = 41;
        public static final int Theme_textColorAlertDialogListItem = 95;
        public static final int Theme_textColorSearchUrl = 67;
        public static final int Theme_toolbarNavigationButtonStyle = 59;
        public static final int Theme_toolbarStyle = 58;
        public static final int Theme_windowActionBar = 2;
        public static final int Theme_windowActionBarOverlay = 4;
        public static final int Theme_windowActionModeOverlay = 5;
        public static final int Theme_windowFixedHeightMajor = 9;
        public static final int Theme_windowFixedHeightMinor = 7;
        public static final int Theme_windowFixedWidthMajor = 6;
        public static final int Theme_windowFixedWidthMinor = 8;
        public static final int Theme_windowMinWidthMajor = 10;
        public static final int Theme_windowMinWidthMinor = 11;
        public static final int Theme_windowNoTitle = 3;
        public static final int[] Toolbar = {16842927, 16843072, com.example.alvaro.apptercero.R.attr.title, com.example.alvaro.apptercero.R.attr.subtitle, com.example.alvaro.apptercero.R.attr.logo, com.example.alvaro.apptercero.R.attr.contentInsetStart, com.example.alvaro.apptercero.R.attr.contentInsetEnd, com.example.alvaro.apptercero.R.attr.contentInsetLeft, com.example.alvaro.apptercero.R.attr.contentInsetRight, com.example.alvaro.apptercero.R.attr.popupTheme, com.example.alvaro.apptercero.R.attr.titleTextAppearance, com.example.alvaro.apptercero.R.attr.subtitleTextAppearance, com.example.alvaro.apptercero.R.attr.titleMargins, com.example.alvaro.apptercero.R.attr.titleMarginStart, com.example.alvaro.apptercero.R.attr.titleMarginEnd, com.example.alvaro.apptercero.R.attr.titleMarginTop, com.example.alvaro.apptercero.R.attr.titleMarginBottom, com.example.alvaro.apptercero.R.attr.maxButtonHeight, com.example.alvaro.apptercero.R.attr.collapseIcon, com.example.alvaro.apptercero.R.attr.collapseContentDescription, com.example.alvaro.apptercero.R.attr.navigationIcon, com.example.alvaro.apptercero.R.attr.navigationContentDescription, com.example.alvaro.apptercero.R.attr.logoDescription, com.example.alvaro.apptercero.R.attr.titleTextColor, com.example.alvaro.apptercero.R.attr.subtitleTextColor};
        public static final int Toolbar_android_gravity = 0;
        public static final int Toolbar_android_minHeight = 1;
        public static final int Toolbar_collapseContentDescription = 19;
        public static final int Toolbar_collapseIcon = 18;
        public static final int Toolbar_contentInsetEnd = 6;
        public static final int Toolbar_contentInsetLeft = 7;
        public static final int Toolbar_contentInsetRight = 8;
        public static final int Toolbar_contentInsetStart = 5;
        public static final int Toolbar_logo = 4;
        public static final int Toolbar_logoDescription = 22;
        public static final int Toolbar_maxButtonHeight = 17;
        public static final int Toolbar_navigationContentDescription = 21;
        public static final int Toolbar_navigationIcon = 20;
        public static final int Toolbar_popupTheme = 9;
        public static final int Toolbar_subtitle = 3;
        public static final int Toolbar_subtitleTextAppearance = 11;
        public static final int Toolbar_subtitleTextColor = 24;
        public static final int Toolbar_title = 2;
        public static final int Toolbar_titleMarginBottom = 16;
        public static final int Toolbar_titleMarginEnd = 14;
        public static final int Toolbar_titleMarginStart = 13;
        public static final int Toolbar_titleMarginTop = 15;
        public static final int Toolbar_titleMargins = 12;
        public static final int Toolbar_titleTextAppearance = 10;
        public static final int Toolbar_titleTextColor = 23;
        public static final int[] View = {16842752, 16842970, com.example.alvaro.apptercero.R.attr.paddingStart, com.example.alvaro.apptercero.R.attr.paddingEnd, com.example.alvaro.apptercero.R.attr.theme};
        public static final int[] ViewBackgroundHelper = {16842964, com.example.alvaro.apptercero.R.attr.backgroundTint, com.example.alvaro.apptercero.R.attr.backgroundTintMode};
        public static final int ViewBackgroundHelper_android_background = 0;
        public static final int ViewBackgroundHelper_backgroundTint = 1;
        public static final int ViewBackgroundHelper_backgroundTintMode = 2;
        public static final int[] ViewStubCompat = {16842960, 16842994, 16842995};
        public static final int ViewStubCompat_android_id = 0;
        public static final int ViewStubCompat_android_inflatedId = 2;
        public static final int ViewStubCompat_android_layout = 1;
        public static final int View_android_focusable = 1;
        public static final int View_android_theme = 0;
        public static final int View_paddingEnd = 3;
        public static final int View_paddingStart = 2;
        public static final int View_theme = 4;

        styleable(Object[] objArr, InstantReloadException instantReloadException) {
            String str = objArr[0];
            switch (str.hashCode()) {
                case -1968665286:
                    return;
                case 1408510031:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$styleable"}));
            }
        }

        public static /* synthetic */ Object access$super(styleable styleable, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1600833221:
                    super.wait(objArr[0].longValue(), objArr[1].intValue());
                    return null;
                case -1554832987:
                    super.finalize();
                    return null;
                case -1166127280:
                    super.notify();
                    return null;
                case -1021472056:
                    super.wait(objArr[0].longValue());
                    return null;
                case -712101345:
                    super.notifyAll();
                    return null;
                case 201261558:
                    return super.getClass();
                case 244142972:
                    super.wait();
                    return null;
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R$styleable"}));
            }
        }

        public styleable() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = {objArr};
                this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
            }
            if (incrementalChange != null) {
                incrementalChange.access$dispatch("init$body.(Landroid/support/design/R$styleable;)V", this);
            }
        }
    }

    R(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[0];
        switch (str.hashCode()) {
            case -1968665286:
                return;
            case 2030071336:
                this();
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R"}));
        }
    }

    public static /* synthetic */ Object access$super(R r, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1600833221:
                super.wait(objArr[0].longValue(), objArr[1].intValue());
                return null;
            case -1554832987:
                super.finalize();
                return null;
            case -1166127280:
                super.notify();
                return null;
            case -1021472056:
                super.wait(objArr[0].longValue());
                return null;
            case -712101345:
                super.notifyAll();
                return null;
            case 201261558:
                return super.getClass();
            case 244142972:
                super.wait();
                return null;
            case 1403628309:
                return new Integer(super.hashCode());
            case 1814730534:
                return new Boolean(super.equals(objArr[0]));
            case 2025021518:
                return super.clone();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "android/support/design/R"}));
        }
    }

    public R() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = {objArr};
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Landroid/support/design/R;)V", this);
        }
    }
}
