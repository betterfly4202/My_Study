<template>
  <div id="login">
    <div class="container">

      <h1>Login Template</h1>

      <div class="row">
        <div class="col-md-4 col-md-offset-4">
          <div class="login-panel panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">Gmediasoft e-mail delivery service</h3>
            </div>
            <div class="panel-body">
              <form role="form">
                <fieldset>
                  <div class="form-group">
                    <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus>
                  </div>
                  <div class="form-group">
                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                  </div>
                  <div class="checkbox">
                    <label>
                      <input name="remember" type="checkbox" value="Remember Me">Remember Me
                    </label>
                  </div>
                  <!-- Change this to a button or input when using this as a form -->
                  <a href="../mail" class="btn btn-lg btn-success btn-block">Login</a>
                </fieldset>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>