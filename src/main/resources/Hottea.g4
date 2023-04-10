grammar Hottea;


prog: expr EOF ;
expr: date someArea? someTrade? type
    ;

someYear : INT YEAR;
someSeason : INT SEASON;
someMonth : INT MONTH?  (TO INT MONTH)?;
someDay: INT DAY;

year : someYear
     |	THIS_YEAR
     |  LASt_YEAR
     |  NEXT_YEAR
     |  EVERY_YEAR
     ;

season : someSeason
     |	LAST_SEASON
     |  THIS_SEASON
     |  NEXT_SEASON
     |  ALL_MONTH
     ;


month : someMonth
     |	LAST_MONTH
     |  THIS_MONTH
     |  NEXT_MONTH
     ;

day : someDay
     |	LAST_DAY
     |  TODAT
     |  TOMORROW
     ;

date :	year? season? month? day?
     ;

someArea : AREA;

tradeNamed : ID* ;

someTrade : tradeNamed? TRADE;

action : SELL
       | tradeNamed?
       ;

type : action (SUM | DETAIL | INCREASE) ;


TO : '-';
YEAR :  '年' | '年度' ;
THIS_YEAR : '今年' ;
LASt_YEAR : '去年' ;
NEXT_YEAR : '明年' ;
EVERY_YEAR: '历年' ;


SEASON : '季度' | '季' ;
LAST_SEASON : '上季度' | '上季' ;
THIS_SEASON : '本季度' | '本季' | '当季' ;
NEXT_SEASON : '下季度' | '下季' ;

MONTH : '月' | '月份' ;
LAST_MONTH : '上月' | '上月份' ;
THIS_MONTH : '本月' | '本月份' | '当月' ;
NEXT_MONTH : '下月' | '下月份' ;
ALL_MONTH  : '全年' ;

DAY : '日' | '号' ;
LAST_DAY : '昨日' | '昨天';
TODAT : '今日' | '今天' ;
TOMORROW : '明日' | '明天' ;

AREA : '华中' | '华中地区' | '西南' | '西南地区' | '西北'  | '西北地区' | '东北' | '东北地区' | '华东' | '华东地区' | '华北'  | '华北地区' | '华南' | '华南地区';

TRADE : '行业' ;

SELL : '销售' ;

SUM : '汇总';
DETAIL : '明细' | '记录' ;
INCREASE:  '增速' | '涨幅' | '增长率';

NEWLINE : [\r\n]+ -> skip;
INT     : [0-9]+ ;
ID : [\u0000-\uFFFF];
//
//fragment UNICODE  :  '\u0000'..'\u00FF';