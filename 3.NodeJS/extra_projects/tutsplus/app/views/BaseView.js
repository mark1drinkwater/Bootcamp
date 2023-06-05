module.exports = class BaseView {
    constructor(response, template) {
        this.response = response;
        this.template;
    }
    render(data) {
        if (this.response && this.template) {
            this.response.render(this.template, data);
        }
    }
}