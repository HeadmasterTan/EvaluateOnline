(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["about"],{1633:function(e,s,t){"use strict";var n=t("bd66"),a=t.n(n);a.a},"2a3e":function(e,s,t){"use strict";var n=t("ab5c"),a=t.n(n);a.a},"2f21":function(e,s,t){"use strict";var n=t("79e5");e.exports=function(e,s){return!!e&&n(function(){s?e.call(null,function(){},1):e.call(null)})}},"55dd":function(e,s,t){"use strict";var n=t("5ca1"),a=t("d8e8"),i=t("4bf8"),o=t("79e5"),r=[].sort,l=[1,2,3];n(n.P+n.F*(o(function(){l.sort(void 0)})||!o(function(){l.sort(null)})||!t("2f21")(r)),"Array",{sort:function(e){return void 0===e?r.call(i(this)):r.call(i(this),a(e))}})},"694b":function(e,s,t){"use strict";t.r(s);var n=function(){var e=this,s=e.$createElement,t=e._self._c||s;return t("div",{staticClass:"rate"},[t("section",{staticClass:"rate-top"},[t("section",{staticClass:"top-flex"},[t("span",{staticClass:"label"},[e._v("待评价人：")]),t("Select",{staticClass:"top-select",on:{"on-change":e.changePerson},model:{value:e.selectedPerson,callback:function(s){e.selectedPerson=s},expression:"selectedPerson"}},e._l(e.ratePerson,function(e){return t("Option",{key:e.id,attrs:{value:e.id,label:e.name}})}),1)],1),t("section",{staticClass:"top-flex rate-info"},[t("span",{staticClass:"label long"},[e._v("已评价 / 总人数")]),t("div",{staticClass:"divider"}),t("span",{staticClass:"value"},[e._v(e._s(e.ratedNum)+" / "+e._s(e.ratePerson.length))])])]),t("section",{directives:[{name:"show",rawName:"v-show",value:e.selectedPerson,expression:"selectedPerson"}],staticClass:"rate-content animated fadeIn"},[e._l(e.subjectList,function(s,n){return t("div",{key:s.id,staticClass:"content-item"},[t("Card",{staticClass:"card-item"},[t("p",{attrs:{slot:"title",title:s.title},slot:"title"},[e._v(e._s(n+1+"、"+s.title))]),t("div",{staticClass:"select-list"},["single"===s.type?t("RadioGroup",{model:{value:e.answers[n],callback:function(s){e.$set(e.answers,n,s)},expression:"answers[index]"}},e._l(s.options,function(s,n){return t("Radio",{key:s.id,staticClass:"list-item",attrs:{label:e.changeNumToEng(n)+"："+s.message}})}),1):e._e(),"multiple"===s.type?t("CheckboxGroup",{model:{value:e.answers[n],callback:function(s){e.$set(e.answers,n,s)},expression:"answers[index]"}},e._l(s.options,function(s,n){return t("Checkbox",{key:s.id,staticClass:"list-item",attrs:{label:e.changeNumToEng(n)+"："+s.message}})}),1):e._e()],1)])],1)}),t("div",{staticClass:"btn-content"},[t("Button",{staticClass:"submit-btn",attrs:{type:"success"},on:{click:e.submitAnswer}},[e._v("提 交")])],1)],2),e.ratePerson.length>0?t("section",{staticClass:"empty"},[e._v("\n        请选择待评价人后开始评价。\n    ")]):e._e(),0===e.ratePerson.length?t("section",{staticClass:"empty"},[e._v("\n        你已经评完了！\n    ")]):e._e()])},a=[],i=(t("55dd"),t("cadf"),t("551c"),t("097d"),{data:function(){return{selectedPerson:"",answers:[],ratedNum:1,ratePerson:[{id:1,name:"谭新"},{id:2,name:"汤选"},{id:3,name:"谭局"},{id:4,name:"谭大"},{id:5,name:"谭老板"}],subjectList:[{title:"员工表现",type:"single",options:[{message:"好"},{message:"一般"},{message:"差"}]},{title:"员工薪资",type:"multiple",options:[{message:"低"},{message:"很低"},{message:"非常低"},{message:"零"}]},{title:"文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试",type:"single",options:[{message:"a"},{message:"b"},{message:"文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试"},{message:"c"}]}]}},methods:{changeNumToEng:function(e){var s=65+e;return String.fromCharCode(s)},changeEndToNum:function(e){return e.charCodeAt()-64},submitAnswer:function(){for(var e=this.subjectList.length,s=[],t=0;t<e;t++){if(!this.answers[t])return void this.$Message.error("还有评价未选！");if("string"===typeof this.answers[t])s.push(this.changeEndToNum(this.answers[t].substr(0,1)));else{for(var n=[],a=0;a<this.answers[t].length;a++)n.push(this.changeEndToNum(this.answers[t][a].substr(0,1)));s.push(n.sort())}}this.delPerson()},delPerson:function(){for(var e=0;this.ratePerson.length;e++)if(this.selectedPerson===this.ratePerson[e].id){this.ratePerson.splice(e,1);break}this.selectedPerson=""},changePerson:function(){this.answers=[]}}}),o=i,r=(t("1633"),t("2a3e"),t("2877")),l=Object(r["a"])(o,n,a,!1,null,"03dfb287",null);l.options.__file="index.vue";s["default"]=l.exports},ab5c:function(e,s,t){},bd66:function(e,s,t){}}]);
//# sourceMappingURL=about.fae48be6.js.map