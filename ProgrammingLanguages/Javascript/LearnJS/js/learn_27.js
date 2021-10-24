/**
 * Javascript, Date() methods.
 */

{
    /**Date.parse();
     * **Not recommend - might not work for all browser.
     * - use to parse in string, interperated as a date.
     * - can get NaN easily if has typo.
     */
    let parsedDate = Date.parse("12 Jan 1995 00:15:54 GMT");
    console.log("parsed date: ", parsedDate);
    let badParsedDate = Date.parse("12 Jan 1995 uwu 00:15:54 GMT");
    console.log("invalid Date parsed: ", badParsedDate); // output: NaN
}

{
    /**Date.UTC()
     * - Date() by default refer to local time zone(ex. GMT+7 if asian).
     * - to make it Universal, Date.UTC(data) will convert to UTC time.
     */
    let myDate = new Date(Date.UTC(2021, 11, 15));
    console.log(myDate);
    
    //Get years of Date()
    console.log(myDate.getFullYear()); // + .getMonth() etc.

    myDate.setHours(12);
    console.log("Date changes 12 hour.\ncurrent date: ", myDate);

    //get time zone offset by UTC time (divided by 60 to het hours)
    console.log(myDate.getTimezoneOffset() / 60);


}