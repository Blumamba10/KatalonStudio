<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>btn_Delete</name>
   <tag></tag>
   <elementGuidId>32f891ee-79fd-4e13-a32a-48f87f120f0d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//i[@class='fas fa-trash-alt']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#btn-main-actions-delete > button[type=&quot;button&quot;]</value>
      </entry>
      <entry>
         <key>BASIC</key>
         <value>//i[@class='fas fa-trash-alt']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>button</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>type</name>
      <type>Main</type>
      <value>button</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>onclick</name>
      <type>Main</type>
      <value>btn_main_actions_delete_onclick(event)</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>title</name>
      <type>Main</type>
      <value>Delete</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

function btn_main_actions_delete_onclick(event)
{
	var buttonObj = $(&quot;main.actions.delete&quot;);
	if (buttonObj.hasClass(&quot;disabled&quot;)) return;
_ul.deleteButtonClick(buttonObj);
}
Delete</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//i[@class='fas fa-trash-alt']</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>(//button[@type='button'])[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='btn-main-actions-delete']/button</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Showing accounts added:'])[1]/preceding::button[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='manually'])[2]/preceding::button[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='Delete']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//tr[3]/td/div/button</value>
   </webElementXpaths>
</WebElementEntity>
