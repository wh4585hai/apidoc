/** 
 * 此接口不要去实现，仅作为输出api文档用的 
 * @author xumin 
 * 
 */  
@Deprecated  
public interface ApiDoc {  
    /** 
     *  
     * @api {post} /login 登陆验证 
     * @apiName 登陆验证  
     * @apiGroup All 
     * @apiVersion 0.1.0 
     * @apiDescription 接口详细描述 
     *  
     * @apiParam {String} username 用户名 
     * @apiParam {String} password 密码 
     *  
     * @apiSuccess {int} code 结果码 
     * @apiSuccess {String} message 消息说明 
     * @apiSuccess {Object} data user信息
     * @apiSuccess {String} sessionId salesForce接口请求需要的字段
     * @apiSuccess {Object} areaConfig 配置信息返回
     * @apiSuccess {String} salesForceURL salesForce接口地址返回
     * @apiSuccess {String} organizationId salesForce接口请求需要的字段
     * @apiSuccess {String} liferayURL liferayURL接口请求需要的字段
     * @apiSuccessExample Success-Response: 
     *  HTTP/1.1 200 OK 
     * { 
     * code:0, 
     * message:'success', 
     * data:{
     *   emailAddress:'mobileappuser@lenovo.com',
     *   firstName:'test',
     *   userId:'0051k000000QlZuAAK',
     *   sessionId:'00D1k0000008ax6!AR4AQKFDcKm29n8MVmMuYmgnZOupDVbmbVf42gyELpnDTW7UN.LJhJBR87bSnw49QRjUm1kSvU9tb2ujqgGrO_QVs8LwlMoL'
     *      } 
     * areaConfig:{
     *    salesForceURL:'https://homolog2-lenovobrasil.cs78.force.com/services/',
     *    organizationId':'00D1k0000008ax6',
     *    webId:'LA',
     *    liferayURL:'https://lauat.lenovopartner.com/mobile-api-portlet/services/'
     *            } 
     * } 
     *   
     *  @apiError {int} code 结果码 
     *  @apiError {String} message 错误消息说明 
     *  @apiErrorExample {json} Error-Response: 
     *  HTTP/1.1 error  
     *  { 
     *   code:1, 
     *   message:'user not found', 
     *   } 
     *    
     * @param param 
     * @return 
     * @throws Exception 
     */  
    void a();  
}  