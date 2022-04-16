const nodemailer = require("nodemailer");

const em = "loje3070@gmail.com";
const empw = "chapark8098";

let receive = "zeroburbon4869@gmail.com";

let transport = nodemailer.createTransport({
    service:"gmail",
    auth:{
        user:em,
        pass:empw,
    },
});

let mailOpt = {
    from:em,
    to:receive,
    subject:"[nodemailer] Sample Email",
    html:"<h1>쓸내용</h1>",
};

transport.sendMail(mailOpt,(error,info) => {
    if(error){
        console.log(error);
        return;
    }

    console.log(info);
    console.log("send email success");
})